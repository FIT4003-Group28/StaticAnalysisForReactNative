package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lle  reason: default package */
/* loaded from: classes3.dex */
public final class lle implements ajru {
    public final Context a;
    public final ony b;
    public final View c;
    public final TextView d;
    public final Switch e;
    private final ajrx f;
    private final ayor g;
    private final TextView h;
    private final aypf i;

    public lle(Context context, gem gemVar, ony onyVar, ayor ayorVar, ViewGroup viewGroup) {
        this.a = context;
        this.f = gemVar;
        this.b = onyVar;
        this.g = ayorVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.c = inflate;
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.summary);
        this.e = (Switch) inflate.findViewById(R.id.switch_button);
        this.i = new aypf();
        gemVar.c(inflate);
        gemVar.d(new View.OnClickListener() { // from class: llb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final lle lleVar = lle.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(lleVar.a);
                final onk onkVar = new onk(lleVar.a);
                onkVar.e(onl.a, onl.b);
                int a = lleVar.b.a();
                onkVar.c(a / 60);
                onkVar.d(a % 60);
                builder.setView(onkVar);
                builder.setTitle(R.string.bollard_setting_dialog_title);
                builder.setNegativeButton(R.string.cancel, gzj.f);
                builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: lla
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        lle lleVar2 = lle.this;
                        onk onkVar2 = onkVar;
                        int a2 = onkVar2.a();
                        int b = onkVar2.b();
                        if (a2 == 0) {
                            if (b == 0) {
                                lleVar2.b.d(false);
                                lleVar2.e(lleVar2.e, false);
                                lleVar2.d();
                            }
                            a2 = 0;
                        }
                        lleVar2.b.d(true);
                        lleVar2.b.e((a2 * 60) + b);
                        lleVar2.e(lleVar2.e, true);
                        lleVar2.d();
                    }
                });
                AlertDialog create = builder.create();
                if (create != null) {
                    create.show();
                }
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.f).b;
    }

    public final void d() {
        if (this.b.g()) {
            zag.m(this.d, onl.a(this.a.getResources(), this.b.a()));
        } else {
            zag.m(this.d, this.a.getResources().getString(R.string.watch_break_setting_summary_off));
        }
    }

    public final void e(Switch r2, boolean z) {
        r2.setOnCheckedChangeListener(null);
        r2.setChecked(z);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: llc
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                lle lleVar = lle.this;
                lleVar.b.d(z2);
                if (z2) {
                    lleVar.c.performClick();
                } else {
                    lleVar.d();
                }
            }
        });
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        lky lkyVar = (lky) obj;
        zag.m(this.h, this.a.getResources().getString(R.string.bollard_setting_title));
        d();
        e(this.e, this.b.g());
        this.i.d(this.b.c.X(this.g).as(new lld(this, 1)));
        this.i.d(this.b.d.X(this.g).as(new lld(this)));
        this.f.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.setOnCheckedChangeListener(null);
        this.c.setOnClickListener(null);
        this.i.c();
    }
}
