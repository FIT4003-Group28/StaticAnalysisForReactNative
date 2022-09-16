package defpackage;
/* compiled from: PG */
/* renamed from: coep  reason: default package */
/* loaded from: classes5.dex */
public final class coep {
    public static final void a(Runnable runnable, int i) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(i);
        thread.start();
    }
}
