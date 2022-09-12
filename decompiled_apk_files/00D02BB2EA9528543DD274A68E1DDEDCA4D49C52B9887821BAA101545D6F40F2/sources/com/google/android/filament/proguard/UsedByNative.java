package com.google.android.filament.proguard;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
/* compiled from: PG */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
/* loaded from: classes.dex */
public @interface UsedByNative {
    String value();
}
