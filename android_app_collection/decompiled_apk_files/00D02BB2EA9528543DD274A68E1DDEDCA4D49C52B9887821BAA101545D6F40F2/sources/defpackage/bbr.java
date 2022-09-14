package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bbr  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbr {
    static {
        bbz.f("InputMerger");
    }

    public static bbr b(String str) {
        try {
            return (bbr) Class.forName(str).newInstance();
        } catch (Exception e) {
            String str2 = "Trouble instantiating + " + str;
            bbz.e().b(e);
            return null;
        }
    }

    public abstract bbp a(List<bbp> list);
}
