package defpackage;
/* compiled from: PG */
/* renamed from: ckkn  reason: default package */
/* loaded from: classes4.dex */
public final class ckkn {
    public static final ckha a = new ckha("TutorialHistoryEntryCountSyncV2", ckgy.TUTORIAL, ckde.c);
    public static final ckha b = new ckha("TutorialHistoryEntryCountGmmSettings", ckgy.TUTORIAL, ckde.c);
    public static final dcdn<dqkc, ckha> c;

    static {
        dqkc[] values;
        dcdg p = dcdn.p();
        for (dqkc dqkcVar : dqkc.values()) {
            if (dqkcVar != dqkc.UNKNOWN_TUTORIAL_TYPE && !bzmm.b.contains(dqkcVar)) {
                String b2 = dbqg.e.b(dbqg.UPPER_CAMEL, dqkcVar.name());
                StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 19);
                sb.append("Tutorial");
                sb.append(b2);
                sb.append("DisplayTime");
                p.f(dqkcVar, new ckha(sb.toString(), ckgy.TUTORIAL));
            }
        }
        c = p.b();
    }
}
