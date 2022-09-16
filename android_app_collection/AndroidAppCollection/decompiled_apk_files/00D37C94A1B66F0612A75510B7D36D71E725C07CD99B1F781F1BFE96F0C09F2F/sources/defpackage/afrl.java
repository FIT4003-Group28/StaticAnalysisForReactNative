package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afrl  reason: default package */
/* loaded from: classes.dex */
public final class afrl extends xo {
    public final arag d;
    final /* synthetic */ afrm e;
    private final List f;

    public afrl(afrm afrmVar, atat atatVar) {
        this.e = afrmVar;
        this.f = atatVar.g;
        arag aragVar = atatVar.d;
        this.d = aragVar == null ? arag.a : aragVar;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.f.size() + 1;
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return i;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new afrk(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_thumbnail_button, viewGroup, false));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        final afrk afrkVar = (afrk) yoVar;
        if (i == 0) {
            afrkVar.w.e.a(afrkVar.t);
            afrkVar.t.setImageDrawable(afrkVar.w.e.mJ().getResources().getDrawable(R.drawable.video_thumbnail_button_selection_box, afrkVar.w.e.mJ().getTheme()));
            afrkVar.u.setText(ajgl.b(afrkVar.w.d));
            afrkVar.v.setVisibility(0);
            afrkVar.v.setClickable(true);
            afrkVar.v.setOnClickListener(new View.OnClickListener() { // from class: afri
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final apzg apzgVar;
                    arag aragVar;
                    arag aragVar2;
                    final afrk afrkVar2 = afrk.this;
                    afrm afrmVar = afrkVar2.w.e;
                    if (!afrmVar.ae && (afrmVar.a.b & 131072) != 0) {
                        afrmVar.F().ak(new afrj(afrkVar2), false);
                        afrm afrmVar2 = afrkVar2.w.e;
                        aafo aafoVar = afrmVar2.e;
                        apzg apzgVar2 = afrmVar2.a.l;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar.a(apzgVar2);
                        return;
                    }
                    atat atatVar = afrmVar.a;
                    if (!atatVar.h) {
                        return;
                    }
                    if ((atatVar.b & 16384) != 0) {
                        apzgVar = atatVar.j;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else {
                        apzgVar = null;
                    }
                    atat atatVar2 = afrkVar2.w.e.a;
                    if ((atatVar2.b & 8192) != 0) {
                        aragVar = atatVar2.i;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    Spanned b = ajgl.b(aragVar);
                    atat atatVar3 = afrkVar2.w.e.a;
                    if ((atatVar3.b & 32768) != 0) {
                        aragVar2 = atatVar3.k;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    Spanned b2 = ajgl.b(aragVar2);
                    if (apzgVar == null || TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
                        String.format(Locale.getDefault(), "Can not show info dialog: %s / %s / %s", apzgVar, b, b2);
                    } else {
                        new AlertDialog.Builder(afrkVar2.w.e.mJ()).setMessage(b).setPositiveButton(b2, new DialogInterface.OnClickListener() { // from class: afrh
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                afrk afrkVar3 = afrk.this;
                                afrkVar3.w.e.e.a(apzgVar);
                            }
                        }).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create().show();
                    }
                }
            });
            return;
        }
        afrkVar.w.e.a(afrkVar.t);
        new afrs(afrkVar.w.e.mJ(), afrkVar.t, afrkVar.w.e.c).a((avhn) this.f.get(i - 1));
    }
}
