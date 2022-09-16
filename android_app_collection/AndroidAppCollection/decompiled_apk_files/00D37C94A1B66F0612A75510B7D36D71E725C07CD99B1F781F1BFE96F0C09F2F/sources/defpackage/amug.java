package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amug  reason: default package */
/* loaded from: classes.dex */
public final class amug extends amzt {
    private final amuk a;

    public amug(amuk amukVar, int i) {
        super(amukVar.size(), i);
        this.a = amukVar;
    }

    @Override // defpackage.amzt
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
