package com.example.taf.utils;

import net.serenitybdd.core.Serenity;

public final class TestSessionUtils {

    public static final String SELECTED_AD_IDS = "selected.ad.ids";

    private TestSessionUtils() {
    }

    public static void store(final String key, final Object obj) {
        if (obj == null || key == null) {
            throw new IllegalStateException("Object to store and key should not be null");
        }
        Serenity.getCurrentSession().put(key, obj);
    }

    public static <T> T get(final String key, final Class<T> returnType) {
        final Object obj = Serenity.getCurrentSession().get(key);
        T result = null;
        try {
            result = returnType.cast(obj);
        } catch (final ClassCastException e) {
            e.printStackTrace();
        }
        return result;
    }

}
