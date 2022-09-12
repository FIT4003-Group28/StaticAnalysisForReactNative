package defpackage;
/* renamed from: deqq  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class deqq implements deqn {
    static final deqn a = new deqq();

    private deqq() {
    }

    @Override // defpackage.deql
    public final void a(Object obj, deqo deqoVar) {
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new deqm(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
