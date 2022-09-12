package defpackage;
/* renamed from: eiv  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class eiv implements Runnable {
    static final Runnable a = new eiv();

    private eiv() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String canonicalName = eiz.class.getCanonicalName();
            if (canonicalName == null) {
                return;
            }
            Class.forName(canonicalName);
        } catch (ClassNotFoundException e) {
            deki.b(e);
        }
    }
}
