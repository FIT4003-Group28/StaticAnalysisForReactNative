package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: ixv  reason: default package */
/* loaded from: classes3.dex */
public final class ixv {
    public final CompoundButton.OnCheckedChangeListener a;
    public ixu b;
    public PlayerResponseModel c;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;
    public izv g;

    public ixv(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.a = onCheckedChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        String string;
        this.f = z;
        ixu ixuVar = this.b;
        if (ixuVar != null) {
            ixz ixzVar = (ixz) ixuVar;
            ixzVar.e.setOnCheckedChangeListener(null);
            ixzVar.e.setChecked(z);
            Optional optional = ixzVar.k;
            final Switch r1 = ixzVar.e;
            r1.getClass();
            optional.ifPresent(new Consumer() { // from class: ixx
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    r1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return consumer.getClass();
                }
            });
            TextView textView = ixzVar.d;
            if (ixzVar.e.isChecked()) {
                string = ixzVar.b.getString(R.string.mdx_autonav_label_on);
            } else {
                string = ixzVar.b.getString(R.string.mdx_autonav_label_off);
            }
            textView.setText(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.e = z;
        ixu ixuVar = this.b;
        if (ixuVar != null) {
            ((ixz) ixuVar).c.setVisibility(true != z ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.d = z;
        ixu ixuVar = this.b;
        if (ixuVar != null) {
            ((ixz) ixuVar).f.setVisibility(true != z ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(PlayerResponseModel playerResponseModel, final izv izvVar) {
        this.c = playerResponseModel;
        this.g = izvVar;
        ixu ixuVar = this.b;
        if (ixuVar == null || playerResponseModel == null || izvVar == null) {
            return;
        }
        ixz ixzVar = (ixz) ixuVar;
        ixzVar.g.setText(playerResponseModel.A());
        ixzVar.h.setText(zgh.i(playerResponseModel.a()));
        ixzVar.i.setBackgroundResource(R.drawable.bg_video_thumb);
        ixzVar.a.j(ixzVar.j, playerResponseModel.b(), ajmu.b);
        ixzVar.f.setOnClickListener(new View.OnClickListener() { // from class: ixw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                izv izvVar2 = izv.this;
                izz izzVar = izvVar2.a;
                PlayerResponseModel playerResponseModel2 = izvVar2.b;
                adnt adntVar = izzVar.e;
                if (adntVar == null) {
                    zep.m(izz.a, "MDx session is null, not handling auto play video request.");
                    return;
                }
                adnk c = adnl.c();
                c.f(playerResponseModel2.B());
                adntVar.L(c.a());
            }
        });
    }
}
