package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abhg  reason: default package */
/* loaded from: classes.dex */
public final class abhg extends ajqd {
    private final aajl h;
    public final ArrayList a = new ArrayList();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    public final ajrt b = new ajrt() { // from class: abhf
        @Override // defpackage.ajrt
        public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
            apzg i2;
            abhg abhgVar = abhg.this;
            if (i < 0 || i >= abhgVar.a.size() || (i2 = abhgVar.i((String) abhgVar.a.get(i))) == null) {
                return;
            }
            ajrsVar.f("live_chat_item_action", i2);
        }
    };

    public abhg(aajl aajlVar) {
        this.h = aajlVar;
    }

    private static Object B(asqy asqyVar) {
        int i = asqyVar.b;
        if (i == 117300536) {
            return (asrf) asqyVar.c;
        }
        if (i == 129492606) {
            return (asrb) asqyVar.c;
        }
        if (i == 165252689) {
            return (asrg) asqyVar.c;
        }
        if (i == 130661514) {
            return (asqz) asqyVar.c;
        }
        if (i == 232396290) {
            return (asra) asqyVar.c;
        }
        if (i == 132496275) {
            return (asrw) asqyVar.c;
        }
        if (i == 146966970) {
            return (asqw) asqyVar.c;
        }
        if (i == 146948953) {
            return (asre) asqyVar.c;
        }
        if (i == 133279312) {
            return (asrc) asqyVar.c;
        }
        if (i == 197064214) {
            return (asrx) asqyVar.c;
        }
        if (i == 251664483) {
            return (asqx) asqyVar.c;
        }
        if (i != 153515154) {
            return null;
        }
        return (aqtb) asqyVar.c;
    }

    private static String C(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof asrf) {
            asrf asrfVar = (asrf) obj;
            if ((asrfVar.b & 1) == 0) {
                return null;
            }
            return asrfVar.c;
        } else if (obj instanceof asrb) {
            return ((asrb) obj).c;
        } else {
            if (obj instanceof asqz) {
                return ((asqz) obj).c;
            }
            if (obj instanceof asra) {
                return ((asra) obj).e;
            }
            if (obj instanceof asrw) {
                return ((asrw) obj).e;
            }
            if (obj instanceof asqw) {
                return ((asqw) obj).c;
            }
            if (obj instanceof asre) {
                asre asreVar = (asre) obj;
                if ((asreVar.b & 1) == 0) {
                    return null;
                }
                return asreVar.c;
            } else if (obj instanceof asrg) {
                return ((asrg) obj).e;
            } else {
                if (obj instanceof asrc) {
                    asrc asrcVar = (asrc) obj;
                    if ((asrcVar.b & 2) == 0) {
                        return null;
                    }
                    return asrcVar.d;
                } else if (obj instanceof asrx) {
                    asrx asrxVar = (asrx) obj;
                    if ((asrxVar.b & 1) == 0) {
                        return null;
                    }
                    return asrxVar.c;
                } else if (obj instanceof asqx) {
                    return ((asqx) obj).c;
                } else {
                    if (!(obj instanceof aqtb)) {
                        return null;
                    }
                    aqtc aqtcVar = ((aqtb) obj).d;
                    if (aqtcVar == null) {
                        aqtcVar = aqtc.a;
                    }
                    return aqtcVar.d;
                }
            }
        }
    }

    private final synchronized void D(String str, Object obj) {
        if (obj instanceof aqtb) {
            obj = ajhh.a((aqtb) obj);
        }
        this.d.put(str, obj);
    }

    private final synchronized void E(String str, apzg apzgVar, arag aragVar, arag aragVar2, boolean z) {
        aunb aunbVar;
        Object obj = this.d.get(str);
        if (obj instanceof asqz) {
            r(str, z);
            return;
        }
        if (obj instanceof asqw) {
            asqw asqwVar = (asqw) obj;
            aoqu aoquVar = null;
            if ((asqwVar.b & 8) != 0) {
                aunbVar = asqwVar.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
            } else {
                aunbVar = null;
            }
            if (aunbVar != null) {
                aoqu k = ajjh.k(aunbVar);
                if ((k instanceof asrf) || (k instanceof asrb) || (k instanceof asrg) || (k instanceof asqz) || (k instanceof asra) || (k instanceof asrw) || (k instanceof asqw) || (k instanceof asre) || (k instanceof asrc) || (k instanceof asrx) || (k instanceof asqx) || (k instanceof aqtb)) {
                    aoquVar = k;
                }
                F(str, aoquVar, z);
            }
        }
        int indexOf = this.a.indexOf(str);
        if (indexOf >= 0) {
            if (obj instanceof ajhh) {
                String obj2 = ajgl.b(aragVar).toString();
                String obj3 = ajgl.b(aragVar2).toString();
                String f = aakj.f(176, str);
                f.getClass();
                aqxo.z(!f.isEmpty(), "key cannot be empty");
                aopa createBuilder = avth.a.createBuilder();
                createBuilder.copyOnWrite();
                avth avthVar = (avth) createBuilder.instance;
                avthVar.b |= 1;
                avthVar.c = f;
                avte avteVar = new avte(createBuilder);
                aopa aopaVar = avteVar.a;
                aopaVar.copyOnWrite();
                avth avthVar2 = (avth) aopaVar.instance;
                obj2.getClass();
                avthVar2.b |= 2;
                avthVar2.d = obj2;
                Boolean bool = false;
                aopa aopaVar2 = avteVar.a;
                boolean booleanValue = bool.booleanValue();
                aopaVar2.copyOnWrite();
                avth avthVar3 = (avth) aopaVar2.instance;
                avthVar3.b |= 8;
                avthVar3.f = booleanValue;
                if (!obj3.isEmpty()) {
                    aopa aopaVar3 = avteVar.a;
                    aopaVar3.copyOnWrite();
                    avth avthVar4 = (avth) aopaVar3.instance;
                    obj3.getClass();
                    avthVar4.b |= 4;
                    avthVar4.e = obj3;
                }
                avtg b = avteVar.b();
                aahb c = ((aagu) this.h).c();
                c.d(b);
                c.b().T();
            } else {
                this.e.put(str, apzgVar);
            }
            if (z) {
                w(indexOf);
            }
        }
    }

    private final synchronized boolean F(String str, Object obj, boolean z) {
        int indexOf = this.a.indexOf(str);
        if (!this.d.containsKey(str) || indexOf < 0) {
            return false;
        }
        String C = C(obj);
        if (C == null) {
            return false;
        }
        this.d.remove(str);
        this.e.remove(str);
        D(C, obj);
        this.a.set(indexOf, C);
        if (z) {
            w(indexOf);
        }
        return true;
    }

    public static String k(Object obj) {
        aunb aunbVar;
        if (obj instanceof asrf) {
            return ((asrf) obj).f;
        }
        if (obj instanceof asqz) {
            return ((asqz) obj).d;
        }
        if (obj instanceof asra) {
            return ((asra) obj).f;
        }
        if (obj instanceof asrw) {
            return ((asrw) obj).g;
        }
        if (obj instanceof asrx) {
            return ((asrx) obj).l;
        }
        if (obj instanceof astb) {
            return ((astb) obj).m;
        }
        if (obj instanceof astc) {
            return ((astc) obj).l;
        }
        if (obj instanceof assz) {
            return ((assz) obj).i;
        }
        if (obj instanceof asqw) {
            asqw asqwVar = (asqw) obj;
            if ((asqwVar.b & 8) != 0) {
                aunbVar = asqwVar.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
            } else {
                aunbVar = null;
            }
            if (aunbVar == null) {
                return null;
            }
            return k(ajjh.k(aunbVar));
        } else if (!(obj instanceof ajhh)) {
            return null;
        } else {
            aqtc aqtcVar = ((ajhh) obj).a.d;
            if (aqtcVar == null) {
                aqtcVar = aqtc.a;
            }
            return aqtcVar.e;
        }
    }

    public static String l(asqy asqyVar) {
        return C(B(asqyVar));
    }

    @Override // defpackage.ajqm
    public final synchronized int a() {
        return this.a.size();
    }

    @Override // defpackage.ajqm
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.ajqm
    public final synchronized Object c(int i) {
        return this.d.get((String) this.a.get(i));
    }

    @Override // defpackage.ajqm
    public final synchronized boolean contains(Object obj) {
        throw null;
    }

    public final synchronized int h(int i) {
        String str = (String) this.a.get(i);
        if (str == null) {
            return 0;
        }
        return ((Integer) this.f.get(str)).intValue();
    }

    public final synchronized apzg i(String str) {
        return (apzg) this.e.get(str);
    }

    @Override // defpackage.ajqm
    public final synchronized boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final synchronized Object j(String str) {
        return this.d.get(str);
    }

    public final synchronized void m(asqy asqyVar, boolean z) {
        Object B = B(asqyVar);
        String C = C(B);
        if (C != null && !this.d.containsKey(C)) {
            if (B != null) {
                D(C, B);
                this.a.add(C);
                if (z) {
                    int a = a();
                    ylr.c();
                    this.c.b(a - 1, 1);
                }
            }
        }
    }

    public final synchronized void n(String str, String str2) {
        this.g.put(str, str2);
    }

    public final synchronized void o(asqy asqyVar, int i) {
        String C = C(B(asqyVar));
        if (C != null && !this.f.containsKey(C)) {
            this.f.put(C, Integer.valueOf(i));
        }
    }

    public final synchronized void p(apzg apzgVar, boolean z) {
        if (apzgVar.qn(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction)) {
            LiveChatAction.MarkChatItemAsDeletedAction markChatItemAsDeletedAction = (LiveChatAction.MarkChatItemAsDeletedAction) apzgVar.qm(LiveChatAction.MarkChatItemAsDeletedAction.markChatItemAsDeletedAction);
            String str = markChatItemAsDeletedAction.e;
            arag aragVar = markChatItemAsDeletedAction.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            arag aragVar2 = aragVar;
            arag aragVar3 = markChatItemAsDeletedAction.d;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            E(str, apzgVar, aragVar2, aragVar3, z);
            return;
        }
        if (apzgVar.qn(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction)) {
            LiveChatAction.MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction = (LiveChatAction.MarkChatItemsByAuthorAsDeletedAction) apzgVar.qm(LiveChatAction.MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction);
            String str2 = markChatItemsByAuthorAsDeletedAction.e;
            for (int i = 0; i < this.a.size(); i++) {
                String str3 = (String) this.a.get(i);
                if (TextUtils.equals(str2, k(this.d.get(str3)))) {
                    arag aragVar4 = markChatItemsByAuthorAsDeletedAction.c;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                    arag aragVar5 = aragVar4;
                    arag aragVar6 = markChatItemsByAuthorAsDeletedAction.d;
                    if (aragVar6 == null) {
                        aragVar6 = arag.a;
                    }
                    E(str3, apzgVar, aragVar5, aragVar6, z);
                }
            }
        }
    }

    public final synchronized void q() {
        this.a.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        v();
    }

    public final synchronized void r(String str, boolean z) {
        int indexOf = this.a.indexOf(str);
        if (indexOf >= 0) {
            this.d.remove(str);
            this.a.remove(str);
            this.e.remove(str);
            if (z) {
                ylr.c();
                z(indexOf, 1);
            }
        }
    }

    public final synchronized boolean s(int i) {
        if (i < this.a.size()) {
            return this.f.containsKey((String) this.a.get(i));
        }
        return false;
    }

    public final boolean t(String str, asqy asqyVar, boolean z) {
        return F(str, B(asqyVar), z);
    }

    public final synchronized void u(String str, apzg apzgVar, boolean z) {
        if (this.g.containsKey(str)) {
            str = (String) this.g.get(str);
        }
        if (!this.d.containsKey(str)) {
            return;
        }
        if (!F(str, j(str), z)) {
            return;
        }
        int indexOf = this.a.indexOf(str);
        if (indexOf >= 0) {
            this.e.put(str, apzgVar);
            if (z) {
                w(indexOf);
            }
        }
    }
}
