package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: trs  reason: default package */
/* loaded from: classes7.dex */
public final class trs {
    public final Map<String, Boolean> a = new HashMap();

    public final boolean a(tlv tlvVar) {
        if (this.a.containsKey(tlvVar.e())) {
            Boolean bool = this.a.get(tlvVar.e());
            dbsk.s(bool);
            return bool.booleanValue();
        }
        return false;
    }
}
