package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: tkn  reason: default package */
/* loaded from: classes4.dex */
public final class tkn implements tkk {
    final /* synthetic */ tju a;

    public tkn(tju tjuVar) {
        this.a = tjuVar;
    }

    @Override // defpackage.tkk
    public final String a(Map map) {
        if (map.containsKey(this.a)) {
            if (!(map.get(this.a) instanceof Boolean)) {
                return String.valueOf(map.get(this.a));
            }
            return true != ((Boolean) map.get(this.a)).booleanValue() ? "0" : "1";
        }
        return null;
    }
}
