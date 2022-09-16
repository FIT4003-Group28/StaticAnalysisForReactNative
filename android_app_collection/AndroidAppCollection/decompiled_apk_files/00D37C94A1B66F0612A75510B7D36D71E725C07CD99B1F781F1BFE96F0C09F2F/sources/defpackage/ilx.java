package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ilx  reason: default package */
/* loaded from: classes3.dex */
public final class ilx extends ajsl {
    public final aafo a;
    private final ajmy b;
    private final ImageView c;
    private final ImageButton d;
    private final View e;
    private final afrs f;

    public ilx(Context context, aafo aafoVar, ajmy ajmyVar) {
        this.b = ajmyVar;
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.metadataeditor_native_thumbnail_view, (ViewGroup) null);
        this.e = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.mde_video_thumbnail);
        this.c = imageView;
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.mde_edit_thumbnail_button);
        this.d = imageButton;
        Drawable drawable = context.getDrawable(2131233452);
        if (drawable != null) {
            imageButton.setImageDrawable(new afrg(context, new yzh(context).b(drawable, zhn.d(context, R.attr.ytOverlayIconActiveOther))));
        }
        this.f = new afrs(context, imageView, ajmyVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        avhn avhnVar;
        final atat atatVar = (atat) obj;
        afrs afrsVar = this.f;
        if ((atatVar.b & 512) != 0) {
            avhnVar = atatVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = avhn.a;
        }
        afrsVar.a(avhnVar);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: ilw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ilx ilxVar = ilx.this;
                atat atatVar2 = atatVar;
                aopa createBuilder = aqsi.a.createBuilder();
                aopc aopcVar = (aopc) aunb.a.createBuilder();
                aopcVar.e(atau.a, atatVar2);
                createBuilder.copyOnWrite();
                aqsi aqsiVar = (aqsi) createBuilder.instance;
                aunb aunbVar = (aunb) aopcVar.mo39build();
                aunbVar.getClass();
                aqsiVar.d = aunbVar;
                aqsiVar.c |= 8;
                aafo aafoVar = ilxVar.a;
                aopc aopcVar2 = (aopc) apzg.a.createBuilder();
                aopcVar2.e(aqsi.b, (aqsi) createBuilder.mo39build());
                aafoVar.a((apzg) aopcVar2.mo39build());
            }
        });
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        atat atatVar = (atat) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.e(this.c);
        this.d.setOnClickListener(null);
    }
}
