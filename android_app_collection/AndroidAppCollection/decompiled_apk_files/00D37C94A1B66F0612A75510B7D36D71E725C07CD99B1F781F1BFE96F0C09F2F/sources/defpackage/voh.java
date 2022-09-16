package defpackage;
/* compiled from: PG */
/* renamed from: voh  reason: default package */
/* loaded from: classes4.dex */
final class voh extends Exception {
    public voh(Throwable th) {
        super("An unknown error occurred during upgrade. The upgrade may fail repeatedly when retried.", th);
    }
}
