package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cutw  reason: default package */
/* loaded from: classes5.dex */
public final class cutw implements cvdk {
    public cvcy a = null;
    private final cuty b;

    public cutw(cuty cutyVar) {
        this.b = cutyVar;
    }

    @Override // defpackage.cuvu
    public final void A() {
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cuvu
    public final void z() {
        cvcy cvcyVar = this.a;
        if (cvcyVar != null) {
            final cuty cutyVar = this.b;
            cutyVar.removeAllViews();
            cutyVar.setVisibility(0);
            cstn.a(cvcyVar.a(), new mw(cutyVar) { // from class: cutx
                private final cuty a;

                {
                    this.a = cutyVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    cuty cutyVar2 = this.a;
                    cugu cuguVar = (cugu) obj;
                    int a = cuguVar.f().a();
                    int i = a - 1;
                    if (a != 0) {
                        if (i == 1) {
                            cutyVar2.a.inflate(R.layout.tombstone_text, cutyVar2);
                            ((TextView) cutyVar2.findViewById(R.id.text)).setText(cuguVar.f().d());
                            return;
                        } else if (i != 3) {
                            if (!cuguVar.e().a() || TextUtils.isEmpty(cuguVar.e().b())) {
                                cutyVar2.setVisibility(8);
                                return;
                            }
                            cutyVar2.a.inflate(R.layout.tombstone_text, cutyVar2);
                            ((TextView) cutyVar2.findViewById(R.id.text)).setText(cuguVar.e().b());
                            return;
                        } else {
                            cutyVar2.a.inflate(R.layout.tombstone_text, cutyVar2);
                            TextView textView = (TextView) cutyVar2.findViewById(R.id.text);
                            textView.setContentDescription(cuwd.a(cuguVar.f().c()));
                            textView.setText(cuwd.b(cutyVar2.getContext(), cuguVar.f().c(), dbsg.i(Integer.valueOf(akm.c(cutyVar2.getContext(), R.color.tombstone_text_color)))), TextView.BufferType.SPANNABLE);
                            return;
                        }
                    }
                    throw null;
                }
            });
            return;
        }
        cstl.a("TombstoneCellPresenter");
    }
}
