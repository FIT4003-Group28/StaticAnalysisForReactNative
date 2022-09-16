package defpackage;
/* compiled from: PG */
/* renamed from: aksp  reason: default package */
/* loaded from: classes.dex */
public final class aksp implements anir {
    final /* synthetic */ String a;
    final /* synthetic */ aksr b;

    public aksp(aksr aksrVar, String str) {
        this.b = aksrVar;
        this.a = str;
    }

    @Override // defpackage.anir
    public final /* bridge */ /* synthetic */ ankt a(Object obj) {
        aksu aksuVar = (aksu) obj;
        if (aksuVar != null) {
            return anlz.q(aksuVar);
        }
        return this.b.a(this.a);
    }
}
