package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: akjk  reason: default package */
/* loaded from: classes.dex */
public class akjk implements bjf {
    protected final SwitchPreference a;
    protected final aurg b;
    protected final akjl c;
    protected final akjm d;
    final afzf e = new akji(this);
    public boolean f;
    public boolean g;

    public akjk(SwitchPreference switchPreference, akjl akjlVar, akjm akjmVar, aurg aurgVar) {
        this.a = switchPreference;
        this.b = aurgVar;
        this.c = akjlVar;
        this.d = akjmVar;
    }

    private final void c(boolean z, aqft aqftVar) {
        Object obj;
        apzg apzgVar = aqftVar.r;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        this.f = !apzgVar.qn(FeedbackEndpointOuterClass.feedbackEndpoint);
        akjl akjlVar = this.c;
        Context context = akjlVar.c;
        aafo aafoVar = akjlVar.d;
        acti actiVar = akjlVar.e;
        akjj akjjVar = new akjj(this, z);
        if (!this.f) {
            obj = this.e;
        } else {
            obj = Boolean.valueOf(z);
        }
        ajgx.c(context, aqftVar, aafoVar, actiVar, akjjVar, obj);
    }

    @Override // defpackage.bjf
    public boolean a(Preference preference, Object obj) {
        aqft aqftVar;
        aqft aqftVar2;
        SwitchPreference switchPreference = this.a;
        if (preference != switchPreference) {
            throw new IllegalArgumentException("SwitchPreferenceChangeListener must be attached to the same SwitchPreference as was used for construction.");
        }
        Boolean bool = (Boolean) obj;
        if (((TwoStatePreference) switchPreference).a == bool.booleanValue()) {
            return true;
        }
        this.c.h.b(akjl.b(this.b).bS);
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            aurg aurgVar = this.b;
            if ((aurgVar.b & 8192) != 0) {
                aurl aurlVar = aurgVar.l;
                if (aurlVar == null) {
                    aurlVar = aurl.a;
                }
                if (aurlVar.b == 64099105) {
                    aqftVar2 = (aqft) aurlVar.c;
                } else {
                    aqftVar2 = aqft.a;
                }
                c(true, aqftVar2);
                return false;
            }
        }
        if (!booleanValue) {
            aurg aurgVar2 = this.b;
            if ((aurgVar2.b & 16384) != 0) {
                aurl aurlVar2 = aurgVar2.m;
                if (aurlVar2 == null) {
                    aurlVar2 = aurl.a;
                }
                if (aurlVar2.b == 64099105) {
                    aqftVar = (aqft) aurlVar2.c;
                } else {
                    aqftVar = aqft.a;
                }
                c(false, aqftVar);
                return false;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        arag aragVar = null;
        if (booleanValue) {
            aafo aafoVar = this.c.d;
            apzg apzgVar = this.b.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
            aurg aurgVar3 = this.b;
            if ((aurgVar3.b & 32) != 0 && (aragVar = aurgVar3.e) == null) {
                aragVar = arag.a;
            }
            preference.n(ajgl.b(aragVar));
        } else {
            aafo aafoVar2 = this.c.d;
            apzg apzgVar2 = this.b.i;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, hashMap);
            aurg aurgVar4 = this.b;
            int i = aurgVar4.b & 2048;
            if (i != 0) {
                if (i != 0 && (aragVar = aurgVar4.j) == null) {
                    aragVar = arag.a;
                }
                preference.n(ajgl.b(aragVar));
            }
        }
        this.d.d(this.b, booleanValue);
        return true;
    }

    public final void b(boolean z) {
        arag aragVar;
        SwitchPreference switchPreference = this.a;
        aurg aurgVar = this.b;
        if ((aurgVar.b & 32) != 0) {
            aragVar = aurgVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        switchPreference.n(ajgl.b(aragVar));
        this.d.d(this.b, z);
        this.a.k(z);
    }
}
