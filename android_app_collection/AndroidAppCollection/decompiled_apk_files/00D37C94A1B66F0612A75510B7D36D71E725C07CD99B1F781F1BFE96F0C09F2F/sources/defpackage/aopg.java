package defpackage;
/* compiled from: PG */
/* renamed from: aopg  reason: default package */
/* loaded from: classes.dex */
public final class aopg extends aooq {
    final aoqu a;
    final Object b;
    public final aoqu c;
    public final aopf d;

    public aopg(aoqu aoquVar, Object obj, aoqu aoquVar2, aopf aopfVar) {
        if (aoquVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (aopfVar.c == aosj.MESSAGE && aoquVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = aoquVar;
        this.b = obj;
        this.c = aoquVar2;
        this.d = aopfVar;
    }

    @Override // defpackage.aooq
    public final int a() {
        return this.d.b;
    }

    public final aosj b() {
        return this.d.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object c(Object obj) {
        return this.d.a() == aosk.ENUM ? this.d.a.mo283findValueByNumber(((Integer) obj).intValue()) : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object d(Object obj) {
        return this.d.a() == aosk.ENUM ? Integer.valueOf(((aopm) obj).getNumber()) : obj;
    }

    public final boolean e() {
        return this.d.d;
    }
}
