package defpackage;
/* compiled from: PG */
/* renamed from: afee  reason: default package */
/* loaded from: classes.dex */
final class afee {
    public final afed a;
    public final afed b;
    public final aetv c;
    public final aetv d;

    public afee(aetv aetvVar, aetv aetvVar2, afgf afgfVar, boolean z, String str, String str2) {
        this.c = aetvVar;
        this.d = aetvVar2;
        long j = afgfVar.a;
        j = j == -1 ? afgfVar.b.b.d : j;
        aetw aetwVar = afgfVar.b;
        this.a = new afed((float) j, z, 0, aetwVar.d, aetwVar.b.c);
        this.b = new afed((float) afgfVar.b.c.a, z, 1, str, str2);
    }

    public static void a(boolean z, afed afedVar, aetv aetvVar) {
        afedVar.a = z;
        aetvVar.i("xvt", afedVar);
    }
}
