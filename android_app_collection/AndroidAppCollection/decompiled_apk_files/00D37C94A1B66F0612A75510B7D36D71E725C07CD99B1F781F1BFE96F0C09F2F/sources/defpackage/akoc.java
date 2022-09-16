package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akoc  reason: default package */
/* loaded from: classes.dex */
public final class akoc implements ajru, ajpz, akmb {
    private final ajqa a;
    private final View b;
    private final akpg c;
    private final TextView d;
    private aknv e;
    private Object f;

    public akoc(Context context, final aafo aafoVar, ajqa ajqaVar, ajmy ajmyVar, ajxz ajxzVar) {
        aafoVar.getClass();
        ajqaVar.getClass();
        this.a = ajqaVar;
        ajxzVar.getClass();
        View inflate = View.inflate(context, R.layout.connection, null);
        this.b = inflate;
        this.c = new akpg(ajmyVar, (ImageView) inflate.findViewById(R.id.connection_thumbnail));
        this.d = (TextView) inflate.findViewById(R.id.user_public_name);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.invitation_button);
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.ignore_invitation_button);
        View findViewById = inflate.findViewById(R.id.content);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: akoa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akoc.this.d(aafoVar);
            }
        });
        findViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: akob
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                akoc.this.d(aafoVar);
                return true;
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aafo r5) {
        /*
            r4 = this;
            aknv r0 = r4.e
            if (r0 != 0) goto L5
            return
        L5:
            aqfw r1 = r0.b
            r2 = 0
            if (r1 == 0) goto L25
            ates r1 = r1.e
            if (r1 != 0) goto L10
            ates r1 = defpackage.ates.a
        L10:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L25
            aqfw r0 = r0.b
            ates r0 = r0.e
            if (r0 != 0) goto L1e
            ates r0 = defpackage.ates.a
        L1e:
            atep r0 = r0.c
            if (r0 != 0) goto L26
            atep r0 = defpackage.atep.a
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L29
            return
        L29:
            aknv r0 = r4.e
            aqfw r1 = r0.b
            if (r1 == 0) goto L3c
            int r0 = r1.b
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L5d
            apzg r2 = r1.g
            if (r2 != 0) goto L5d
            apzg r2 = defpackage.apzg.a
            goto L5d
        L3c:
            aqfy r1 = r0.c
            if (r1 == 0) goto L4d
            int r0 = r1.b
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L5d
            apzg r2 = r1.f
            if (r2 != 0) goto L5d
            apzg r2 = defpackage.apzg.a
            goto L5d
        L4d:
            aqfz r0 = r0.d
            if (r0 == 0) goto L5d
            int r1 = r0.b
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L5d
            apzg r2 = r0.f
            if (r2 != 0) goto L5d
            apzg r2 = defpackage.apzg.a
        L5d:
            if (r2 != 0) goto L60
            return
        L60:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "com.google.android.libraries.youtube.innertube.endpoint.tag"
            r0.put(r1, r4)
            java.lang.Object r1 = r4.f
            java.lang.String r3 = "contact_menu_source_model"
            r0.put(r3, r1)
            r5.c(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akoc.d(aafo):void");
    }

    protected final void e(aknv aknvVar) {
        aqky aqkyVar;
        aqfw aqfwVar = aknvVar.b;
        Spanned spanned = null;
        arag aragVar = null;
        arag aragVar2 = null;
        arag aragVar3 = null;
        if (aqfwVar != null) {
            if ((aqfwVar.b & 2) != 0) {
                aqkyVar = aqfwVar.d;
                if (aqkyVar == null) {
                    aqkyVar = aqky.a;
                }
            }
            aqkyVar = null;
        } else {
            aqfy aqfyVar = aknvVar.c;
            if (aqfyVar != null) {
                if ((aqfyVar.b & 2) != 0) {
                    aqkyVar = aqfyVar.d;
                    if (aqkyVar == null) {
                        aqkyVar = aqky.a;
                    }
                }
                aqkyVar = null;
            } else {
                aqfz aqfzVar = aknvVar.d;
                if (aqfzVar != null && (aqfzVar.b & 2) != 0) {
                    aqkyVar = aqfzVar.d;
                    if (aqkyVar == null) {
                        aqkyVar = aqky.a;
                    }
                }
                aqkyVar = null;
            }
        }
        akpg akpgVar = this.c;
        if (aqkyVar == null || (aqkyVar.b & 1) == 0) {
            akpgVar.b(4);
        } else {
            avhn avhnVar = aqkyVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            akpgVar.a(avhnVar);
            akpgVar.b(0);
        }
        TextView textView = this.d;
        aqfw aqfwVar2 = aknvVar.b;
        if (aqfwVar2 != null) {
            if ((aqfwVar2.b & 1) != 0 && (aragVar = aqfwVar2.c) == null) {
                aragVar = arag.a;
            }
            spanned = ajgl.b(aragVar);
        } else {
            aqfy aqfyVar2 = aknvVar.c;
            if (aqfyVar2 != null) {
                if ((aqfyVar2.b & 1) != 0 && (aragVar2 = aqfyVar2.c) == null) {
                    aragVar2 = arag.a;
                }
                spanned = ajgl.b(aragVar2);
            } else {
                aqfz aqfzVar2 = aknvVar.d;
                if (aqfzVar2 != null) {
                    if ((aqfzVar2.b & 1) != 0 && (aragVar3 = aqfzVar2.c) == null) {
                        aragVar3 = arag.a;
                    }
                    spanned = ajgl.b(aragVar3);
                }
            }
        }
        textView.setText(spanned);
    }

    @Override // defpackage.ajpz
    public final void kA(Uri uri, Uri uri2) {
        aknv aknvVar = (aknv) this.a.b(uri);
        this.e = aknvVar;
        e(aknvVar);
    }

    @Override // defpackage.ajru
    public final void oK(ajrs ajrsVar, Object obj) {
        this.f = obj;
        if (this.e != null) {
            this.a.e(this);
        }
        aqfw aqfwVar = (aqfw) obj;
        aknv aknvVar = new aknv((aqfwVar.b & 512) != 0 ? aqfwVar.h : null, aqfwVar, null, null);
        Uri a = akpq.a(aknvVar.b());
        this.e = (aknv) this.a.c(a, aknvVar);
        this.a.h(a, this);
        e(this.e);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
