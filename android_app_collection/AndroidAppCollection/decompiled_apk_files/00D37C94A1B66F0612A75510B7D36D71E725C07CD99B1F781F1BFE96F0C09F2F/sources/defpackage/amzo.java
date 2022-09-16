package defpackage;
/* compiled from: PG */
/* renamed from: amzo  reason: default package */
/* loaded from: classes.dex */
final class amzo extends amrt {
    public final amxt a;
    public final Object b;

    public amzo(amxt amxtVar, Object obj) {
        this.a = amxtVar;
        this.b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amsz a() {
        return this.a.c;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // defpackage.amrt, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }
}
