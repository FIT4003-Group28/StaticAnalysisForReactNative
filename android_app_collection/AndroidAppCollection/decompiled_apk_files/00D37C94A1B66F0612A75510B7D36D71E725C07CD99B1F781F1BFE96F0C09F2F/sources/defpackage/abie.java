package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: abie  reason: default package */
/* loaded from: classes.dex */
public final class abie implements abre, abjh, afzf {
    public abgz a;
    public final Context b;
    private final aafo c;
    private final ajuw d;
    private final abha e;
    private final azqb f;
    private final ajgz g;

    public abie(Context context, aafo aafoVar, ajuw ajuwVar, abha abhaVar, azqb azqbVar, ajgz ajgzVar) {
        aafoVar.getClass();
        this.c = aafoVar;
        this.d = ajuwVar;
        this.e = abhaVar;
        this.b = context;
        this.f = azqbVar;
        this.g = ajgzVar;
    }

    public static final void g(Context context, arrz arrzVar) {
        int i = arrzVar.b;
        if ((i & 4) == 0) {
            if ((i & 2) != 0) {
                return;
            }
            zag.q(context, R.string.video_is_flagged, 1);
            return;
        }
        arrx arrxVar = arrzVar.e;
        if (arrxVar == null) {
            arrxVar = arrx.a;
        }
        arag aragVar = arrxVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.r(context, ajgl.b(aragVar), 1);
    }

    @Override // defpackage.abjh
    public final abgz a() {
        return this.a;
    }

    @Override // defpackage.abjh
    public final afzf b() {
        return null;
    }

    @Override // defpackage.abjh
    public final assu c() {
        return null;
    }

    @Override // defpackage.abjh
    public final String d() {
        return null;
    }

    @Override // defpackage.abjh
    public final String e() {
        return null;
    }

    @Override // defpackage.abre
    public final void f(aten atenVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        if (abgc.d(atenVar) != null) {
            this.c.c(abgc.d(atenVar), hashMap);
        } else if (abgc.e(atenVar) != null) {
            this.c.c(abgc.e(atenVar), hashMap);
        } else {
            ater aterVar = atenVar.d;
            if (aterVar == null) {
                aterVar = ater.a;
            }
            if ((aterVar.b & 16) == 0) {
                return;
            }
            aafo aafoVar = this.c;
            ater aterVar2 = atenVar.d;
            if (aterVar2 == null) {
                aterVar2 = ater.a;
            }
            apzg apzgVar = aterVar2.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        }
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zag.q(this.b, R.string.live_chat_report_form_service_failed, 1);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final void lG(Object obj) {
        arsc arscVar;
        asof asofVar;
        if (obj instanceof asbi) {
            asbj asbjVar = ((asbi) obj).c;
            if (asbjVar == null) {
                asbjVar = asbj.a;
            }
            if (asbjVar.b != 113762946) {
                return;
            }
            this.d.c((aunm) asbjVar.c, this);
        } else if (obj instanceof arrz) {
            final arrz arrzVar = (arrz) obj;
            if (arrzVar == null) {
                return;
            }
            if (arrzVar.g.size() > 0) {
                this.e.a(arrzVar.g, this.a, true);
            }
            if ((arrzVar.b & 8) != 0) {
                arscVar = arrzVar.f;
                if (arscVar == null) {
                    arscVar = arsc.a;
                }
            } else {
                arscVar = null;
            }
            if (arscVar != null && arscVar.b == 171313147) {
                ajun ajunVar = (ajun) this.f.get();
                if (arscVar.b == 171313147) {
                    asofVar = (asof) arscVar.c;
                } else {
                    asofVar = asof.a;
                }
                ajunVar.a(asofVar, amon.a, this);
            } else if (arscVar != null && arscVar.b == 85374086) {
                ajhb.g(this.b, (aqxq) arscVar.c, this.c, this.g, this);
            } else if ((arrzVar.b & 2) == 0) {
                g(this.b, arrzVar);
            } else {
                AlertDialog.Builder cancelable = new AlertDialog.Builder(this.b).setCancelable(true);
                arag aragVar = arrzVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                View findViewById = cancelable.setMessage(ajgl.b(aragVar)).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: abid
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        abie abieVar = abie.this;
                        abie.g(abieVar.b, arrzVar);
                    }
                }).show().findViewById(16908299);
                if (!(findViewById instanceof TextView)) {
                    return;
                }
                ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
            }
        } else {
            zep.l("Unhandled ServiceListener response received!");
        }
    }
}
