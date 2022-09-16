package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ajvj  reason: default package */
/* loaded from: classes.dex */
public final class ajvj {
    public final Map a = new HashMap();
    private final Map b = new HashMap();
    private Pattern c;

    public final arag a(assu assuVar) {
        aopc aopcVar = (aopc) arag.a.createBuilder();
        int size = assuVar.c.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                aopc aopcVar2 = (aopc) arai.a.createBuilder();
                assv assvVar = (assv) assuVar.c.get(i);
                String str = "";
                if ((assvVar.b == 1 ? (String) assvVar.c : str).isEmpty()) {
                    assv assvVar2 = (assv) assuVar.c.get(i);
                    if (!(assvVar2.b == 2 ? (String) assvVar2.c : str).isEmpty()) {
                        aopg aopgVar = aqup.b;
                        Map map = this.a;
                        assv assvVar3 = (assv) assuVar.c.get(i);
                        if (assvVar3.b == 2) {
                            str = (String) assvVar3.c;
                        }
                        aopcVar2.e(aopgVar, (aqup) map.get(str));
                    }
                } else {
                    assv assvVar4 = (assv) assuVar.c.get(i);
                    if (assvVar4.b == 1) {
                        str = (String) assvVar4.c;
                    }
                    aopcVar2.copyOnWrite();
                    arai araiVar = (arai) aopcVar2.instance;
                    str.getClass();
                    araiVar.b |= 1;
                    araiVar.c = str;
                }
                aopcVar.cs(aopcVar2);
            }
        }
        boolean z = assuVar.d;
        aopcVar.copyOnWrite();
        arag aragVar = (arag) aopcVar.instance;
        aragVar.b = 2 | aragVar.b;
        aragVar.e = z;
        return (arag) aopcVar.mo39build();
    }

    public final avhn b(String str) {
        if (this.a.containsKey(str)) {
            avhn avhnVar = ((aqup) this.a.get(str)).f;
            return avhnVar == null ? avhn.a : avhnVar;
        }
        return null;
    }

    public final String c(String str) {
        if (!this.a.containsKey(str) || (((aqup) this.a.get(str)).c & 4) == 0) {
            return null;
        }
        avhn avhnVar = ((aqup) this.a.get(str)).f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        if ((avhnVar.b & 4) == 0) {
            return null;
        }
        avhn avhnVar2 = ((aqup) this.a.get(str)).f;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        aovs aovsVar = avhnVar2.d;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) == 0) {
            return null;
        }
        avhn avhnVar3 = ((aqup) this.a.get(str)).f;
        if (avhnVar3 == null) {
            avhnVar3 = avhn.a;
        }
        aovs aovsVar2 = avhnVar3.d;
        if (aovsVar2 == null) {
            aovsVar2 = aovs.a;
        }
        aovr aovrVar = aovsVar2.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        return aovrVar.c;
    }

    public final String d(String str) {
        if (this.b.containsKey(str.toLowerCase(Locale.ROOT))) {
            return (String) this.b.get(str.toLowerCase(Locale.ROOT));
        }
        return null;
    }

    public final String e(String str) {
        aqup aqupVar = (aqup) this.a.get(str);
        return aqupVar == null ? "" : aqupVar.g ? (this.a.get(str) == null || ((aqup) this.a.get(str)).e.size() <= 0 || TextUtils.isEmpty((String) ((aqup) this.a.get(str)).e.get(0))) ? " " : (String) ((aqup) this.a.get(str)).e.get(0) : str;
    }

    public final Pattern f() {
        if (!this.b.isEmpty()) {
            return this.c;
        }
        return null;
    }

    public final void g(List list) {
        this.c = null;
        this.a.clear();
        this.b.clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            aqup aqupVar = (aqup) list.get(i);
            this.a.put(aqupVar.d, aqupVar);
            if (!aqupVar.h) {
                for (String str : aqupVar.e) {
                    if (aqupVar.g) {
                        this.b.put(str.toLowerCase(Locale.ROOT), aqupVar.d);
                        String replaceAll = str.replaceAll("([^a-zA-Z0-9 :_-])", "\\\\$1");
                        StringBuilder sb = new StringBuilder(String.valueOf(replaceAll).length() + 2);
                        sb.append("(");
                        sb.append(replaceAll);
                        sb.append(")");
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.c = Pattern.compile(TextUtils.join("|", arrayList), 10);
    }

    public final boolean h() {
        return this.c != null;
    }
}
