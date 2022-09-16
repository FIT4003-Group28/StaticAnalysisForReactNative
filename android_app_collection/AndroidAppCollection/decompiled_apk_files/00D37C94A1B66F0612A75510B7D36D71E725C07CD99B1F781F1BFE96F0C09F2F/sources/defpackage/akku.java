package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: akku  reason: default package */
/* loaded from: classes.dex */
public final class akku implements zix, zis, akok {
    public final ziw a;
    public final akpf b;
    public final Uri c = akpr.a;
    public aqgm d;
    public aqgl e;
    public zjc f;
    public Uri g;
    public Object h;
    private final Context i;
    private final aafo j;
    private final zjb k;
    private final ajsm l;
    private final akoi m;
    private final ajxz n;
    private final int o;
    private atep p;
    private List q;
    private aqgn r;

    public akku(Context context, aafo aafoVar, zjb zjbVar, ziw ziwVar, akph akphVar, akpf akpfVar, ajsm ajsmVar, akoi akoiVar, int i) {
        this.i = context;
        this.j = aafoVar;
        this.k = zjbVar;
        this.a = ziwVar;
        this.b = akpfVar;
        this.l = ajsmVar;
        this.m = akoiVar;
        this.n = akphVar;
        this.o = i;
    }

    private static aqgl i(Object obj) {
        if (obj instanceof aqkj) {
            aqkj aqkjVar = (aqkj) obj;
            if (aqkjVar.qn(aqgl.b)) {
                return (aqgl) aqkjVar.qm(aqgl.b);
            }
            return null;
        }
        return null;
    }

    private static aqgm j(Object obj) {
        if (obj instanceof aqkj) {
            aqkj aqkjVar = (aqkj) obj;
            if (aqkjVar.qn(aqgm.b)) {
                return (aqgm) aqkjVar.qm(aqgm.b);
            }
            return null;
        }
        return null;
    }

    private final void k(aqgl aqglVar, boolean z, akkt... akktVarArr) {
        ateg a;
        arag aragVar;
        String obj;
        araj arajVar;
        arag aragVar2;
        akkt[] akktVarArr2 = akktVarArr;
        this.q = new ArrayList();
        int length = akktVarArr2.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            akkt akktVar = akktVarArr2[i2];
            if ((z || akktVar != akkt.CHANNEL_ITEM) && (a = akktVar.a(aqglVar)) != null) {
                int i3 = a.c;
                if (i3 != 4) {
                    if (i3 == 1) {
                        aragVar = (arag) a.d;
                    } else {
                        aragVar = arag.a;
                    }
                    obj = ajgl.b(aragVar).toString();
                } else {
                    HashMap hashMap = new HashMap();
                    arag aragVar3 = this.d.d;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    hashMap.put("user_name", ajgl.b(aragVar3).toString());
                    if (a.c == 4) {
                        arajVar = (araj) a.d;
                    } else {
                        arajVar = araj.a;
                    }
                    ajvf ajvfVar = new ajvf(arajVar);
                    if (ajvfVar.a != null && !ajvfVar.b.isEmpty() && ajvfVar.a.d.size() != 0 && ajvfVar.b.size() == ajvfVar.a.d.size() && (aragVar2 = ajvfVar.c) != null && aragVar2.c.size() != 0) {
                        arai[] araiVarArr = (arai[]) ajvfVar.c.c.toArray(new arai[i]);
                        for (int i4 = 0; i4 < ajvfVar.b.size(); i4++) {
                            int d = ajvfVar.a.d.d(i4);
                            if (d >= 0 && d < araiVarArr.length) {
                                String str = (String) ajvfVar.b.get(i4);
                                aopc aopcVar = (aopc) araiVarArr[d].mo52toBuilder();
                                if (hashMap.containsKey(str)) {
                                    String str2 = (String) hashMap.get(str);
                                    aopcVar.copyOnWrite();
                                    arai araiVar = (arai) aopcVar.instance;
                                    str2.getClass();
                                    araiVar.b |= 1;
                                    araiVar.c = str2;
                                }
                                araiVarArr[d] = (arai) aopcVar.mo39build();
                            }
                        }
                        aopc aopcVar2 = (aopc) ajvfVar.c.mo52toBuilder();
                        aopcVar2.copyOnWrite();
                        ((arag) aopcVar2.instance).c = arag.emptyProtobufList();
                        List asList = Arrays.asList(araiVarArr);
                        aopcVar2.copyOnWrite();
                        arag aragVar4 = (arag) aopcVar2.instance;
                        aragVar4.a();
                        aonk.addAll((Iterable) asList, (List) aragVar4.c);
                        ajvfVar.c = (arag) aopcVar2.mo39build();
                    }
                    obj = ajgl.b(ajvfVar.c).toString();
                }
                vez vezVar = new vez(obj);
                vezVar.f(this.o);
                if ((a.b & 4) != 0) {
                    ajxz ajxzVar = this.n;
                    arhs arhsVar = a.e;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    int a2 = ajxzVar.a(b);
                    if (a2 != 0) {
                        vezVar.e = this.i.getResources().getDrawable(a2);
                    }
                }
                this.q.add(akktVar);
                this.l.add(vezVar);
            }
            i2++;
            akktVarArr2 = akktVarArr;
            i = 0;
        }
        this.l.l();
    }

    private final void l() {
        this.l.clear();
        for (aten atenVar : this.p.c) {
            vez vezVar = new vez(abgc.h(atenVar).toString());
            vezVar.f(this.o);
            if (abgc.f(atenVar) != null) {
                ajxz ajxzVar = this.n;
                arhr b = arhr.b(abgc.f(atenVar).c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                int a = ajxzVar.a(b);
                if (a != 0) {
                    try {
                        vezVar.e = this.i.getResources().getDrawable(a);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            }
            this.l.add(vezVar);
        }
    }

    @Override // defpackage.zis
    public final void a() {
        throw null;
    }

    @Override // defpackage.zix
    public final void b(List list) {
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            ziu ziuVar = (ziu) listIterator.next();
            Uri uri = ziuVar.a;
            if (uri.equals(this.g)) {
                aqgm j = j(ziuVar.b);
                this.d = j;
                if (j == null) {
                    zep.l(String.format("Path %s is not a contact.", this.g));
                }
            } else if (uri.equals(this.c)) {
                aqgl i = i(ziuVar.b);
                this.e = i;
                if (i == null) {
                    zep.l(String.format("Path %s is not a config.", this.c));
                }
            }
        }
        d();
    }

    public final void c(String str) {
        aopa createBuilder = EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) createBuilder.instance;
        str.getClass();
        editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.b |= 1;
        editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.c = str;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint, (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) createBuilder.mo39build());
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
        this.j.c((apzg) aopcVar.mo39build(), hashMap);
    }

    public final void d() {
        aqgm aqgmVar = this.d;
        if (aqgmVar == null || this.e == null) {
            return;
        }
        akoi akoiVar = this.m;
        arag aragVar = aqgmVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        avhn avhnVar = this.d.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        akoiVar.a(b, null, avhnVar);
        boolean z = (this.d.c & 4096) != 0;
        this.l.clear();
        akkt akktVar = akkt.CHANNEL_ITEM;
        int a = aqgn.a(this.d.f);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 2) {
            k(this.e, z, akkt.CHANNEL_ITEM, akkt.BLOCK_ITEM);
        } else if (i == 5) {
            k(this.e, z, akkt.CHANNEL_ITEM, akkt.UNBLOCK_ITEM);
        } else if (i == 7) {
            k(this.e, z, akkt.CHANNEL_ITEM);
        } else {
            zep.l("Unknown contact state");
        }
        this.b.aE();
    }

    public final void e() {
        arag aragVar;
        atep atepVar = this.p;
        if (atepVar != null) {
            atev atevVar = atepVar.d;
            if (atevVar == null) {
                atevVar = atev.a;
            }
            avhn avhnVar = null;
            if (atevVar.b == 82258301) {
                this.m.a.setVisibility(0);
                akoi akoiVar = this.m;
                atev atevVar2 = this.p.d;
                if (atevVar2 == null) {
                    atevVar2 = atev.a;
                }
                if (((atevVar2.b == 82258301 ? (ateu) atevVar2.c : ateu.a).b & 1) != 0) {
                    atev atevVar3 = this.p.d;
                    if (atevVar3 == null) {
                        atevVar3 = atev.a;
                    }
                    aragVar = (atevVar3.b == 82258301 ? (ateu) atevVar3.c : ateu.a).c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                akoiVar.a(ajgl.b(aragVar), null, null);
            } else {
                atev atevVar4 = this.p.d;
                if (atevVar4 == null) {
                    atevVar4 = atev.a;
                }
                if (atevVar4.b == 94310230) {
                    this.m.a.setVisibility(0);
                    akoi akoiVar2 = this.m;
                    atev atevVar5 = this.p.d;
                    if (atevVar5 == null) {
                        atevVar5 = atev.a;
                    }
                    arag aragVar2 = (atevVar5.b == 94310230 ? (aqfv) atevVar5.c : aqfv.a).c;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    Spanned b = ajgl.b(aragVar2);
                    atev atevVar6 = this.p.d;
                    if (atevVar6 == null) {
                        atevVar6 = atev.a;
                    }
                    arag aragVar3 = (atevVar6.b == 94310230 ? (aqfv) atevVar6.c : aqfv.a).d;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    Spanned b2 = ajgl.b(aragVar3);
                    atev atevVar7 = this.p.d;
                    if (atevVar7 == null) {
                        atevVar7 = atev.a;
                    }
                    if (((atevVar7.b == 94310230 ? (aqfv) atevVar7.c : aqfv.a).b & 4) != 0) {
                        atev atevVar8 = this.p.d;
                        if (atevVar8 == null) {
                            atevVar8 = atev.a;
                        }
                        avhnVar = (atevVar8.b == 94310230 ? (aqfv) atevVar8.c : aqfv.a).e;
                        if (avhnVar == null) {
                            avhnVar = avhn.a;
                        }
                    }
                    akoiVar2.a(b, b2, avhnVar);
                } else {
                    this.m.a.setVisibility(8);
                }
            }
            l();
            this.b.aE();
        }
    }

    @Override // defpackage.akok
    public final void f(int i) {
        final String str;
        arag aragVar;
        try {
            atep atepVar = this.p;
            if (atepVar != null) {
                if (i >= 0 && i < atepVar.c.size()) {
                    aten atenVar = (aten) this.p.c.get(i);
                    apzg e = abgc.e(atenVar);
                    if (e != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
                        this.j.c(e, hashMap);
                    } else {
                        apzg d = abgc.d(atenVar);
                        if (d != null) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.h);
                            this.j.c(d, hashMap2);
                        }
                    }
                }
            } else if (this.d != null && this.e != null) {
                akkt akktVar = (akkt) this.q.get(i);
                arag aragVar2 = null;
                if (akktVar == akkt.CHANNEL_ITEM) {
                    aafo aafoVar = this.j;
                    apzg apzgVar = this.d.n;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                } else {
                    ateg a = akktVar.a(this.e);
                    aqgm aqgmVar = this.d;
                    switch (akktVar.ordinal()) {
                        case 1:
                            str = aqgmVar.k;
                            break;
                        case 2:
                            str = aqgmVar.l;
                            break;
                        case 3:
                            str = aqgmVar.m;
                            break;
                        case 4:
                            str = aqgmVar.g;
                            break;
                        case 5:
                            str = aqgmVar.i;
                            break;
                        case 6:
                            str = aqgmVar.h;
                            break;
                        case 7:
                            str = aqgmVar.j;
                            break;
                        case 8:
                            str = aqgmVar.o;
                            break;
                        default:
                            throw new IllegalArgumentException(akktVar.name());
                    }
                    if ((a.b & 8) != 0) {
                        if (this.r == null) {
                            this.r = new aqgn();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(this.i);
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: akks
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                akku akkuVar = akku.this;
                                String str2 = str;
                                if (i2 == -1) {
                                    akkuVar.c(str2);
                                }
                            }
                        };
                        aqfr aqfrVar = a.f;
                        if (aqfrVar == null) {
                            aqfrVar = aqfr.a;
                        }
                        aafo aafoVar2 = this.j;
                        if ((aqfrVar.b & 1) != 0) {
                            aragVar = aqfrVar.c;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                        } else {
                            aragVar = null;
                        }
                        builder.setTitle(ajgl.b(aragVar));
                        if ((aqfrVar.b & 2) != 0 && (aragVar2 = aqfrVar.d) == null) {
                            aragVar2 = arag.a;
                        }
                        builder.setMessage(aafv.a(aragVar2, aafoVar2, false));
                        if ((aqfrVar.b & 4) != 0) {
                            arag aragVar3 = aqfrVar.e;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                            builder.setNegativeButton(ajgl.b(aragVar3), onClickListener);
                        }
                        if ((aqfrVar.b & 8) != 0) {
                            arag aragVar4 = aqfrVar.f;
                            if (aragVar4 == null) {
                                aragVar4 = arag.a;
                            }
                            builder.setPositiveButton(ajgl.b(aragVar4), onClickListener);
                        }
                        AlertDialog create = builder.create();
                        create.show();
                        View findViewById = create.findViewById(16908299);
                        if (findViewById instanceof TextView) {
                            ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
                        }
                    } else {
                        c(str);
                    }
                }
            }
        } finally {
            ((akmx) this.b).ku();
        }
    }

    public final void g(atep atepVar, Object obj) {
        atepVar.getClass();
        this.p = atepVar;
        this.h = obj;
        e();
    }

    public final void h() {
        this.d = j(this.k.b(this.g));
        this.e = i(this.k.b(this.c));
    }
}
