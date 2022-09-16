package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: abhz  reason: default package */
/* loaded from: classes.dex */
public final class abhz implements abkm, abhb, zdx {
    public final Set a = new HashSet();
    public assk b;
    private final aafo c;
    private final yzj d;
    private final abha e;
    private final ajvj f;
    private final abiq g;
    private apzg h;
    private final Context i;

    public abhz(abha abhaVar, aafo aafoVar, yzj yzjVar, ajvj ajvjVar, abiq abiqVar, Context context) {
        this.e = abhaVar;
        this.c = aafoVar;
        this.d = yzjVar;
        this.f = ajvjVar;
        abiqVar.getClass();
        this.g = abiqVar;
        abiqVar.y(this);
        this.i = context;
    }

    private static final String i(apzg apzgVar) {
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) apzgVar.qm(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint);
        if (sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.d.isEmpty()) {
            return null;
        }
        return TextUtils.concat(sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.d, String.valueOf(System.currentTimeMillis())).toString();
    }

    @Override // defpackage.abhb
    public final void a(assk asskVar) {
        asrs asrsVar;
        apoj apojVar;
        apzg apzgVar;
        asrs asrsVar2;
        apoj apojVar2;
        this.b = asskVar;
        if (asskVar.b == 121323709) {
            asrsVar = (asrs) asskVar.c;
        } else {
            asrsVar = asrs.a;
        }
        asrp asrpVar = asrsVar.g;
        if (asrpVar == null) {
            asrpVar = asrp.a;
        }
        if (asrpVar.b == 65153809) {
            apojVar = (apoj) asrpVar.c;
        } else {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 8192) != 0) {
            if (asskVar.b == 121323709) {
                asrsVar2 = (asrs) asskVar.c;
            } else {
                asrsVar2 = asrs.a;
            }
            asrp asrpVar2 = asrsVar2.g;
            if (asrpVar2 == null) {
                asrpVar2 = asrp.a;
            }
            if (asrpVar2.b == 65153809) {
                apojVar2 = (apoj) asrpVar2.c;
            } else {
                apojVar2 = apoj.a;
            }
            apzgVar = apojVar2.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        this.h = apzgVar;
        for (abko abkoVar : this.a) {
            abkoVar.d(asskVar);
        }
    }

    @Override // defpackage.abhb
    public final void b() {
        for (abko abkoVar : this.a) {
            abkoVar.f();
        }
    }

    public final void c(abko abkoVar) {
        if (this.a.contains(abkoVar)) {
            return;
        }
        abkoVar.e();
        ((abop) abkoVar).l = this;
        abpu abpuVar = ((abpw) abkoVar).y;
        abpuVar.g = this;
        abpi abpiVar = abpuVar.a;
        if (abpiVar != null) {
            abpiVar.l = abpuVar;
        }
        assk asskVar = this.b;
        if (asskVar != null) {
            abkoVar.d(asskVar);
        }
        this.a.add(abkoVar);
    }

    @Override // defpackage.abkm
    public final void d() {
    }

    @Override // defpackage.abkm
    public final void f(assu assuVar) {
        if (this.h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new abjs(this.g, this.e, this.d, this.f, assuVar, i(this.h), null, null, null));
            this.c.c(this.h, hashMap);
        }
    }

    @Override // defpackage.abkm
    public final void g(CharSequence charSequence) {
        if (this.h != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new abjs(this.g, this.e, this.d, charSequence.toString().trim(), i(this.h)));
            this.c.c(this.h, hashMap);
        }
    }

    @Override // defpackage.abkm
    public final void h(apzg apzgVar) {
        this.e.a(amuk.r(apzgVar), this.g, true);
    }

    @Override // defpackage.zdx
    public final void j() {
    }

    @Override // defpackage.abkm
    public final void e(apoj apojVar) {
        int i = apojVar.b;
        if ((32768 & i) == 0) {
            if ((i & 512) == 0) {
                return;
            }
            zag.r(this.i, apojVar.j, 0);
            return;
        }
        aafo aafoVar = this.c;
        apzg apzgVar = apojVar.p;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }
}
