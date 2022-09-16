package defpackage;

import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: kpm  reason: default package */
/* loaded from: classes3.dex */
public final class kpm {
    public final aafo a;
    public final PrivacySpinner b;
    public AdapterView.OnItemSelectedListener c;
    private final ajxz d;

    public kpm(aafo aafoVar, ajxz ajxzVar, PrivacySpinner privacySpinner) {
        this.a = aafoVar;
        this.d = ajxzVar;
        this.b = privacySpinner;
    }

    private final boolean d() {
        return this.b.getSelectedItem() instanceof aqrc;
    }

    public final void a(aqrd aqrdVar) {
        if (aqrdVar != null && !aqrdVar.c.isEmpty()) {
            for (aqra aqraVar : aqrdVar.c) {
                aqrc aqrcVar = aqraVar.c;
                if (aqrcVar == null) {
                    aqrcVar = aqrc.a;
                }
                if ((aqrcVar.b & 8192) != 0) {
                    aqrc aqrcVar2 = aqraVar.c;
                    if (aqrcVar2 == null) {
                        aqrcVar2 = aqrc.a;
                    }
                    if ((aqrcVar2.b & 4) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (aqra aqraVar2 : aqrdVar.c) {
                            if ((aqraVar2.b & 8) != 0) {
                                aqrc aqrcVar3 = aqraVar2.c;
                                if (aqrcVar3 == null) {
                                    aqrcVar3 = aqrc.a;
                                }
                                arrayList.add(aqrcVar3);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        this.b.setAdapter((SpinnerAdapter) new kpl(this, this.b.getContext(), this.d, arrayList));
                        PrivacySpinner privacySpinner = this.b;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            if (((aqrc) arrayList.get(i2)).h) {
                                i = i2;
                                break;
                            }
                            i2++;
                        }
                        privacySpinner.setSelection(i);
                        this.b.setOnItemSelectedListener(new kpj(this));
                    }
                }
            }
        }
        this.b.c(3);
        this.b.setOnItemSelectedListener(new kpj(this));
    }

    public final int b() {
        if (!d()) {
            return this.b.d();
        }
        aqrc aqrcVar = (aqrc) this.b.getSelectedItem();
        return awwc.bX(aqrcVar.c == 6 ? ((Integer) aqrcVar.d).intValue() : 0);
    }

    public final void c(int i) {
        if (b() == i) {
            return;
        }
        if (d()) {
            for (int i2 = 0; i2 < this.b.getAdapter().getCount(); i2++) {
                aqrc aqrcVar = (aqrc) this.b.getAdapter().getItem(i2);
                int intValue = aqrcVar.c == 6 ? ((Integer) aqrcVar.d).intValue() : 0;
                int i3 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (intValue == i3) {
                    this.b.setSelection(i2);
                }
            }
            return;
        }
        this.b.e(i);
    }
}
