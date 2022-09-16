package defpackage;

import android.content.res.Resources;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpcc  reason: default package */
/* loaded from: classes3.dex */
public class bpcc implements bpvr {
    public final bowr a;
    private final Resources b;
    private final btvo c;

    public bpcc(Resources resources, btvo btvoVar, bowr bowrVar) {
        this.b = resources;
        this.a = bowrVar;
        this.c = btvoVar;
    }

    @Override // defpackage.bpvr
    public CompoundButton.OnCheckedChangeListener a() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: bpcb
            private final bpcc a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                bpcc bpccVar = this.a;
                if (bpccVar.a.b.booleanValue()) {
                    z = !z;
                }
                if (z != bpccVar.a.c.booleanValue()) {
                    bpccVar.a.c = Boolean.valueOf(z);
                    cqkx.p(bpccVar);
                }
            }
        };
    }

    @Override // defpackage.bpvr
    public Boolean b() {
        return this.a.b;
    }

    @Override // defpackage.bpvr
    public Boolean c() {
        btvo btvoVar = this.c;
        boolean z = false;
        if (btvoVar == null) {
            return false;
        }
        boolean z2 = btvoVar.getUgcParameters().z();
        if (this.a.a.booleanValue() && !z2 && this.c.getUgcParameters().g()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bpvr
    public CharSequence d() {
        if (this.c.getUgcParameters().i()) {
            return this.b.getString(R.string.RAP_PLACE_IS_CLOSED_OR_MOVED);
        }
        return this.b.getString(R.string.RAP_PLACE_IS_CLOSED);
    }

    @Override // defpackage.bpvr
    public Boolean e() {
        return Boolean.valueOf(this.a.a());
    }

    public Boolean f() {
        return this.a.a;
    }
}
