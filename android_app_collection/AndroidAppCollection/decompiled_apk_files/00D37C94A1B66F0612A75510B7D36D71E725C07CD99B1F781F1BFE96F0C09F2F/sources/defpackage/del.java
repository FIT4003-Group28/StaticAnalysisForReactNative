package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: del  reason: default package */
/* loaded from: classes3.dex */
public final class del implements dfh {
    final /* synthetic */ den a;
    private final ArrayList b = new ArrayList();

    public del(den denVar) {
        this.a = denVar;
    }

    @Override // defpackage.dfh
    public final void a(dfg dfgVar) {
        e(dfgVar);
    }

    @Override // defpackage.dfh
    public final void b(dfg dfgVar) {
        e(dfgVar);
    }

    @Override // defpackage.dfh
    public final void c(dfg dfgVar) {
        dfgVar.b(this.b);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            dfm dfmVar = (dfm) this.b.get(i);
            dej dejVar = (dej) ((deh) this.a.b.a(dfmVar.a())).a.get(dfmVar.b());
            dejVar.c = Float.valueOf(dfmVar.b);
            dejVar.b = dfgVar;
        }
        this.b.clear();
        if (!TextUtils.isEmpty((String) this.a.c.e(dfgVar.hashCode()))) {
            dfgVar.hashCode();
        }
    }

    @Override // defpackage.dfh
    public final boolean d(dfg dfgVar) {
        Float f;
        dfgVar.b(this.b);
        int size = this.b.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            dfm dfmVar = (dfm) this.b.get(i);
            def a = dfmVar.a();
            deh dehVar = (deh) this.a.b.a(a);
            dej dejVar = dehVar != null ? (dej) dehVar.a.get(dfmVar.b()) : null;
            if (cyg.a) {
                String valueOf = String.valueOf(a);
                String b = dfmVar.b().b();
                float f2 = dfmVar.b;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + b.length());
                sb.append("Trying to start animation on ");
                sb.append(valueOf);
                sb.append("#");
                sb.append(b);
                sb.append(" to ");
                sb.append(f2);
                sb.append(":");
            }
            if (dejVar == null) {
                boolean z2 = cyg.a;
                z = false;
            }
            if (z && (f = dejVar.d) != null && f.floatValue() != dfmVar.b) {
                if (cyg.a) {
                    String valueOf2 = String.valueOf(dejVar.d);
                    float f3 = dfmVar.b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 95);
                    sb2.append(" - Canceling animation, last mounted value does not equal animation target: ");
                    sb2.append(valueOf2);
                    sb2.append(" != ");
                    sb2.append(f3);
                }
                z = false;
            }
        }
        this.b.clear();
        return z;
    }

    public final void e(dfg dfgVar) {
        boolean z;
        dej dejVar;
        List list = (List) this.a.a.remove(dfgVar);
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dfn dfnVar = (dfn) list.get(i);
            def defVar = dfnVar.a;
            deh dehVar = (deh) this.a.b.a(defVar);
            dfe dfeVar = dfnVar.b;
            if (dehVar.c == 2) {
                if (((dej) dehVar.a.get(dfeVar)) != null) {
                    dejVar.e--;
                    if (dehVar.c == 2) {
                        Iterator it = dehVar.a.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((dej) it.next()).e > 0) {
                                    z = false;
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z && dehVar.b != null) {
                            for (dfe dfeVar2 : dehVar.a.keySet()) {
                                den.e(dfeVar2, dehVar.b);
                            }
                        }
                    } else {
                        throw new RuntimeException("This should only be checked for disappearing animations");
                    }
                } else {
                    throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                }
            } else {
                dej dejVar2 = (dej) dehVar.a.get(dfeVar);
                if (dejVar2 == null) {
                    throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                }
                int i2 = dejVar2.e - 1;
                dejVar2.e = i2;
                if (i2 <= 0) {
                    dehVar.a.remove(dfeVar);
                    boolean isEmpty = dehVar.a.isEmpty();
                    if (dehVar.b != null) {
                        den.h(dfeVar, dfeVar.e((dbn) dehVar.e.d()), dehVar.b);
                    }
                    z = isEmpty;
                } else {
                    continue;
                }
            }
            if (!z) {
                continue;
            } else {
                if (cyg.a) {
                    String.valueOf(String.valueOf(defVar)).length();
                }
                dda ddaVar = dehVar.b;
                if (ddaVar != null) {
                    this.a.d(ddaVar, true);
                }
                dei deiVar = this.a.i;
                if (deiVar != null) {
                    dcp dcpVar = (dcp) deiVar;
                    dda ddaVar2 = (dda) dcpVar.l.remove(defVar);
                    if (ddaVar2 != null) {
                        dcpVar.l(ddaVar2);
                    } else {
                        if (!dcpVar.j.remove(defVar) && cyg.a) {
                            String valueOf = String.valueOf(defVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                            sb.append("Ending animation for id ");
                            sb.append(valueOf);
                            sb.append(" but it wasn't recorded as animating!");
                            Log.e("LithoAnimationDebug", sb.toString());
                        }
                        dda ddaVar3 = (dda) dcpVar.h.t.get(defVar);
                        if (ddaVar3 != null) {
                            short s = ddaVar3.b;
                            for (int i3 = 0; i3 < s; i3++) {
                                dcpVar.q(dcpVar.h, ((dbn) ddaVar3.c(i3)).i, false);
                            }
                            if (dfz.a && dcpVar.j.isEmpty()) {
                                int length = dcpVar.k.length;
                                for (int i4 = 0; i4 < length; i4++) {
                                    if (dcpVar.k[i4] != 0) {
                                        StringBuilder sb2 = new StringBuilder(70);
                                        sb2.append("No running animations but index ");
                                        sb2.append(i4);
                                        sb2.append(" is still animation locked!");
                                        throw new RuntimeException(sb2.toString());
                                    }
                                }
                            }
                        }
                    }
                }
                this.a.b.d(defVar);
                den.b(dehVar);
            }
        }
        if (TextUtils.isEmpty((String) this.a.c.e(dfgVar.hashCode()))) {
            return;
        }
        dfgVar.hashCode();
        this.a.c.l(dfgVar.hashCode());
    }
}
