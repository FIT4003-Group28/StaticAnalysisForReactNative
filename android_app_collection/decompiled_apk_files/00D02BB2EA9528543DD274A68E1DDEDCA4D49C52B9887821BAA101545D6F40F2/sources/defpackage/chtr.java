package defpackage;
/* compiled from: PG */
/* renamed from: chtr  reason: default package */
/* loaded from: classes4.dex */
public abstract class chtr {
    public static chtr b(dcdn<dpwe, Integer> dcdnVar) {
        return new chtn(dcdnVar);
    }

    public abstract dcdn<dpwe, Integer> a();

    public final int c(dpwe dpweVar) {
        return a().getOrDefault(dpweVar, 0).intValue();
    }
}
