package defpackage;
/* compiled from: PG */
/* renamed from: arcc  reason: default package */
/* loaded from: classes.dex */
public final class arcc {
    public final arcr a;
    public ardx b;
    public boolean c;
    public int d;

    public arcc(arcr arcrVar, boolean z, int i, ardx ardxVar) {
        this.a = arcrVar;
        this.c = z;
        this.b = ardxVar;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        ardx ardxVar = this.b;
        boolean z = this.c;
        int i = this.d;
        dcdn<Integer, Integer> dcdnVar = z ? ardxVar.e : ardxVar.d;
        if (true != dcdnVar.containsKey(Integer.valueOf(i))) {
            i = -1;
        }
        Integer num = dcdnVar.get(Integer.valueOf(i));
        dbsk.s(num);
        return num.intValue();
    }
}
