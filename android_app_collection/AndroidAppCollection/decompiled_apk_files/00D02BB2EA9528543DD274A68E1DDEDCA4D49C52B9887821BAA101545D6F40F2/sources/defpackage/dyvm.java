package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyvm  reason: default package */
/* loaded from: classes6.dex */
final class dyvm implements dyvn {
    @Override // defpackage.dyvn
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
