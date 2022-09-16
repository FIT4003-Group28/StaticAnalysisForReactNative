package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoqm  reason: default package */
/* loaded from: classes.dex */
public final class aoqm {
    private static final aoqs b = new aoqk();
    public final aoqs a;

    public aoqm() {
        aoqs aoqsVar;
        aoqs[] aoqsVarArr = new aoqs[2];
        aoqsVarArr[0] = aoqk.a;
        try {
            aoqsVar = (aoqs) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            aoqsVar = b;
        }
        aoqsVarArr[1] = aoqsVar;
        aoql aoqlVar = new aoql(aoqsVarArr);
        aopv.i(aoqlVar, "messageInfoFactory");
        this.a = aoqlVar;
    }

    public static boolean a(aoqr aoqrVar) {
        return aoqrVar.b() == aord.PROTO2;
    }
}
