package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqb  reason: default package */
/* loaded from: classes2.dex */
public abstract class bqb {
    private static final String a = bqf.b("InputMerger");

    public static bqb b(String str) {
        try {
            return (bqb) Class.forName(str).newInstance();
        } catch (Exception e) {
            bqf.a();
            String str2 = a;
            bqf.e(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract bpx a(List list);
}
