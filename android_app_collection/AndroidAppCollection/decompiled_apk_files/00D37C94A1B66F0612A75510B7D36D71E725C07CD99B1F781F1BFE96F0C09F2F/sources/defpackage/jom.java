package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: jom  reason: default package */
/* loaded from: classes3.dex */
final class jom implements yiw {
    final /* synthetic */ Map a;

    public jom(Map map) {
        this.a = map;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = (String) obj;
        if (this.a.containsKey(str)) {
            ((yiw) this.a.get(str)).a(str, exc);
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        if (this.a.containsKey(str)) {
            ((yiw) this.a.get(str)).b(str, bool);
        }
    }
}
