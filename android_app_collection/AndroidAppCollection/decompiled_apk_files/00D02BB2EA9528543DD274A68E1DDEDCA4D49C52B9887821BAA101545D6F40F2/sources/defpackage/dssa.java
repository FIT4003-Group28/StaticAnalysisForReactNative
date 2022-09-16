package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dssa  reason: default package */
/* loaded from: classes.dex */
public final class dssa {
    private static final dssh b = new dsry();
    public final dssh a;

    public dssa() {
        dssh dsshVar;
        dssh[] dsshVarArr = new dssh[2];
        dsshVarArr[0] = dsqo.a;
        try {
            dsshVar = (dssh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            dsshVar = b;
        }
        dsshVarArr[1] = dsshVar;
        dsrz dsrzVar = new dsrz(dsshVarArr);
        dsrk.i(dsrzVar, "messageInfoFactory");
        this.a = dsrzVar;
    }

    public static boolean a(dssg dssgVar) {
        return dssgVar.c() == 1;
    }
}
