package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.format.DateFormat;
/* compiled from: PG */
/* renamed from: bzkp  reason: default package */
/* loaded from: classes4.dex */
public final class bzkp {
    private final Context a;

    public bzkp(Application application) {
        this.a = application;
    }

    public final int a() {
        return DateFormat.is24HourFormat(this.a) ? 2 : 1;
    }
}
