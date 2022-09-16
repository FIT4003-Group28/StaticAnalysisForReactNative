package defpackage;

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: osh  reason: default package */
/* loaded from: classes4.dex */
public final class osh {
    public static final Pattern a = Pattern.compile(" +");
    private static final Pattern d = Pattern.compile("\\W");
    private static osh e = new osh(new osf[0]);
    private static Object f;
    public final osf[] b;
    public final Pattern c;

    public osh(osf[] osfVarArr) {
        Arrays.sort(osfVarArr);
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < osfVarArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(d.matcher(osfVarArr[i].c).replaceAll("\\\\$0"));
        }
        sb.append(")");
        this.c = Pattern.compile(sb.toString());
        this.b = osfVarArr;
    }

    public static synchronized osh a(ContentResolver contentResolver) {
        synchronized (osh.class) {
            Object b = rxn.b(contentResolver);
            if (b == f) {
                return e;
            }
            Map e2 = rxn.e(contentResolver, "url:");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : e2.entrySet()) {
                try {
                    String substring = ((String) entry.getKey()).substring(4);
                    String str = (String) entry.getValue();
                    if (str != null && str.length() != 0) {
                        arrayList.add(new osf(substring, str));
                    }
                } catch (osg e3) {
                    Log.e("UrlRules", "Invalid rule from Gservices", e3);
                }
            }
            osh oshVar = new osh((osf[]) arrayList.toArray(new osf[arrayList.size()]));
            e = oshVar;
            f = b;
            return oshVar;
        }
    }
}
