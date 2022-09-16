package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afyl  reason: default package */
/* loaded from: classes.dex */
public abstract class afyl extends yua implements afye {
    public static final byte[] o = new byte[0];
    public static final ceu p = new ceu("x-youtube-fut-processed", "true");

    public afyl(int i, String str, cez cezVar) {
        super(i, str, cezVar);
    }

    public static boolean B(cew cewVar) {
        List list = cewVar.d;
        return list != null && list.contains(p);
    }

    public afvm e() {
        return afvl.a;
    }

    @Override // defpackage.afye
    public final String g() {
        return m();
    }

    public String u() {
        return null;
    }

    public List v() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basic CURL command:");
        try {
            Map f = f();
            for (String str : f.keySet()) {
                if (!str.equals("Content-Type")) {
                    String str2 = (String) f.get(str);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length());
                    sb2.append("-H \"");
                    sb2.append(str);
                    sb2.append(":");
                    sb2.append(str2);
                    sb2.append("\" ");
                    sb.append(sb2.toString());
                }
            }
            String m = m();
            StringBuilder sb3 = new StringBuilder(String.valueOf(m).length() + 2);
            sb3.append("'");
            sb3.append(m);
            sb3.append("'");
            sb.append(sb3.toString());
            return Collections.singletonList(sb.toString());
        } catch (ceq e) {
            zep.d("Auth failure.", e);
            return Collections.singletonList("Received exception while trying to get logs.");
        }
    }

    public synchronized List w(cew cewVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.add("Default response logging.");
        int i = cewVar.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append("Status: ");
        sb.append(i);
        sb.append("\n");
        arrayList.add(sb.toString());
        for (String str : cewVar.c.keySet()) {
            String str2 = (String) cewVar.c.get(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(str2).length());
            sb2.append("Header:");
            sb2.append(str);
            sb2.append(":");
            sb2.append(str2);
            sb2.append("\n");
            arrayList.add(sb2.toString());
        }
        byte[] bArr = cewVar.b;
        if (bArr != null) {
            int length = bArr.length;
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Actual data length: ");
            sb3.append(length);
            arrayList.add(sb3.toString());
            for (String str3 : zgh.q(new String(cewVar.b))) {
                arrayList.add(str3);
            }
        } else {
            arrayList.add("Response had no data.");
        }
        return arrayList;
    }

    public boolean z() {
        return false;
    }

    public afyl(String str, ytz ytzVar, cez cezVar) {
        super(1, str, ytzVar, cezVar, false);
    }

    public afyl(ytz ytzVar, cez cezVar, boolean z) {
        super(2, "", ytzVar, cezVar, z);
    }
}
