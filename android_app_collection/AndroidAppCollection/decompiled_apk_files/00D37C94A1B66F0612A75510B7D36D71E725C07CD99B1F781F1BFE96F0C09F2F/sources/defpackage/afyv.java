package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: afyv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afyv implements ylw {
    public final /* synthetic */ yua a;
    private final /* synthetic */ int b;

    public /* synthetic */ afyv(yua yuaVar, int i) {
        this.b = i;
        this.a = yuaVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        String str;
        if (this.b == 0) {
            yua yuaVar = this.a;
            cfb cfbVar = (cfb) obj;
            if (cfbVar.c()) {
                yuaVar.qz(cfbVar.a);
                return;
            }
            cff cffVar = cfbVar.c;
            if (cffVar != null) {
                yuaVar.o(cffVar);
                return;
            } else {
                yuaVar.o(new cff("Non-successful response with no error"));
                return;
            }
        }
        yua yuaVar2 = this.a;
        if (!((Boolean) obj).booleanValue()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Basic CURL command:");
        try {
            for (Map.Entry entry : yuaVar2.f().entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str3).length());
                sb2.append("-H \"");
                sb2.append(str2);
                sb2.append(":");
                sb2.append(str3);
                sb2.append("\" ");
                sb.append(sb2.toString());
            }
            String m = yuaVar2.m();
            StringBuilder sb3 = new StringBuilder(String.valueOf(m).length() + 2);
            sb3.append("'");
            sb3.append(m);
            sb3.append("'");
            sb.append(sb3.toString());
            str = sb.toString();
        } catch (ceq e) {
            zep.d("Auth failure.", e);
            str = "Received exception while trying to get logs.";
        }
        zep.g(str);
    }
}
