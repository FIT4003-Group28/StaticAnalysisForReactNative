package defpackage;

import android.content.res.Resources;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajex  reason: default package */
/* loaded from: classes2.dex */
public class ajex {
    public final Resources a;

    public ajex(Resources resources) {
        this.a = resources;
    }

    public static int a(long j, TimeUnit timeUnit) {
        return (int) ((j + (timeUnit.toMillis(1L) / 2)) / timeUnit.toMillis(1L));
    }
}
