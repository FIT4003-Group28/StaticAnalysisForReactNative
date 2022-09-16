package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: mla  reason: default package */
/* loaded from: classes3.dex */
public final class mla implements ajru {
    private final ViewGroup a;
    private final ViewGroup b;
    private final ViewGroup c;
    private final fpa d;
    private final fjy e;
    private final fly f;
    private flx g;

    public mla(Activity activity, fjy fjyVar, fpa fpaVar, fly flyVar) {
        this.e = fjyVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.item_section_menu_header, (ViewGroup) null);
        this.a = viewGroup;
        this.c = (ViewGroup) viewGroup.findViewById(R.id.sub_menu_container);
        this.d = fpaVar;
        this.f = flyVar;
        this.b = (ViewGroup) viewGroup.findViewById(R.id.buttons_view);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aopa aopaVar;
        aslp aslpVar = (aslp) obj;
        if ((aslpVar.b & 8) != 0) {
            aslr aslrVar = aslpVar.d;
            if (aslrVar == null) {
                aslrVar = aslr.a;
            }
            auxr auxrVar = aslrVar.c;
            if (auxrVar == null) {
                auxrVar = auxr.a;
            }
            aopaVar = auxrVar.mo52toBuilder();
        } else {
            aopaVar = null;
        }
        aopa mo52toBuilder = aslpVar.mo52toBuilder();
        this.c.removeAllViews();
        if (aopaVar != null) {
            if (this.g == null) {
                this.g = this.f.c(this.a);
            }
            if (((auxr) aopaVar.instance).d.isEmpty()) {
                arag aragVar = ((aslp) mo52toBuilder.instance).c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                if (!TextUtils.isEmpty(ajgl.b(aragVar))) {
                    arag aragVar2 = ((aslp) mo52toBuilder.instance).c;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    String obj2 = ajgl.b(aragVar2).toString();
                    aopaVar.copyOnWrite();
                    auxr auxrVar2 = (auxr) aopaVar.instance;
                    obj2.getClass();
                    auxrVar2.b |= 1;
                    auxrVar2.d = obj2;
                    aslr aslrVar2 = ((aslp) mo52toBuilder.instance).d;
                    if (aslrVar2 == null) {
                        aslrVar2 = aslr.a;
                    }
                    aopa mo52toBuilder2 = aslrVar2.mo52toBuilder();
                    mo52toBuilder2.copyOnWrite();
                    aslr aslrVar3 = (aslr) mo52toBuilder2.instance;
                    auxr auxrVar3 = (auxr) aopaVar.mo39build();
                    auxrVar3.getClass();
                    aslrVar3.c = auxrVar3;
                    aslrVar3.b |= 1;
                    mo52toBuilder.copyOnWrite();
                    aslp aslpVar2 = (aslp) mo52toBuilder.instance;
                    aslr aslrVar4 = (aslr) mo52toBuilder2.mo39build();
                    aslrVar4.getClass();
                    aslpVar2.d = aslrVar4;
                    aslpVar2.b |= 8;
                }
            }
            this.g.oK(ajrsVar, (auxr) aopaVar.mo39build());
            this.c.addView(this.g.c);
        }
        List<apok> unmodifiableList = Collections.unmodifiableList(((aslp) mo52toBuilder.instance).e);
        if (unmodifiableList.isEmpty()) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            HashMap hashMap = new HashMap(1);
            hashMap.put("sectionListController", ajrsVar.c("sectionListController"));
            this.b.removeAllViews();
            for (apok apokVar : unmodifiableList) {
                if ((apokVar.b & 1) != 0) {
                    fjx a = this.e.a(null, hashMap);
                    apoj apojVar = apokVar.c;
                    if (apojVar == null) {
                        apojVar = apoj.a;
                    }
                    a.oK(ajrsVar, apojVar);
                    this.b.addView(a.b);
                }
            }
        }
        this.d.a(mo52toBuilder.mo39build(), this.a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
