package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.ui.bottomui.Mealbar;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: fuu  reason: default package */
/* loaded from: classes3.dex */
final class fuu implements fuf {
    private final Mealbar a;
    private final ajmy b;
    private final akbn c;

    public fuu(Mealbar mealbar, ajmy ajmyVar, akbn akbnVar) {
        this.a = mealbar;
        mealbar.setOnClickListener(null);
        this.b = ajmyVar;
        this.c = akbnVar;
    }

    private static final View.OnClickListener b(final View.OnClickListener onClickListener, final ftp ftpVar) {
        if (onClickListener == null) {
            return new View.OnClickListener() { // from class: fus
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ftp.this.a(1);
                }
            };
        }
        return new View.OnClickListener() { // from class: fur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View.OnClickListener onClickListener2 = onClickListener;
                ftp ftpVar2 = ftpVar;
                onClickListener2.onClick(view);
                ftpVar2.a(1);
            }
        };
    }

    @Override // defpackage.fuf
    public final /* bridge */ /* synthetic */ View a(fue fueVar, ftp ftpVar) {
        akff akffVar = (akff) fueVar;
        Mealbar mealbar = this.a;
        zag.m(mealbar.g, akffVar.a);
        Mealbar mealbar2 = this.a;
        zag.m(mealbar2.h, akffVar.b);
        avhn avhnVar = akffVar.i;
        if (avhnVar != null) {
            ImageView imageView = this.a.k;
            imageView.setVisibility(0);
            this.b.h(imageView, avhnVar);
        } else {
            int i = akffVar.j;
            if (i != 0) {
                Optional optional = akffVar.k;
                final ImageView imageView2 = this.a.k;
                this.b.e(imageView2);
                imageView2.setVisibility(0);
                optional.ifPresent(new Consumer() { // from class: fut
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        ImageView imageView3 = imageView2;
                        imageView3.setImageTintList(zhn.f(imageView3.getContext(), ((zhe) obj).a));
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return consumer.getClass();
                    }
                });
                imageView2.setImageResource(i);
            } else {
                this.a.k.setVisibility(8);
            }
        }
        if (this.c != null && akffVar.e != null) {
            Mealbar mealbar3 = this.a;
            View.OnClickListener b = b(akffVar.d, ftpVar);
            this.c.a(mealbar3.i).b(akffVar.e, null);
            mealbar3.i.setOnClickListener(b);
        } else {
            Mealbar mealbar4 = this.a;
            CharSequence charSequence = akffVar.c;
            View.OnClickListener b2 = b(akffVar.d, ftpVar);
            zag.m(mealbar4.i, charSequence);
            Button button = mealbar4.i;
            zag.k(button, button.getBackground());
            mealbar4.i.setOnClickListener(b2);
        }
        if (this.c == null || akffVar.h == null) {
            Mealbar mealbar5 = this.a;
            CharSequence charSequence2 = akffVar.f;
            View.OnClickListener b3 = b(akffVar.g, ftpVar);
            zag.m(mealbar5.j, charSequence2);
            mealbar5.j.setOnClickListener(b3);
        } else {
            Mealbar mealbar6 = this.a;
            View.OnClickListener b4 = b(akffVar.g, ftpVar);
            this.c.a(mealbar6.j).b(akffVar.h, null);
            mealbar6.j.setOnClickListener(b4);
        }
        return this.a;
    }
}
