package defpackage;

import android.text.Spanned;
import android.text.SpannedString;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adws  reason: default package */
/* loaded from: classes.dex */
public final class adws implements airt {
    final /* synthetic */ adwt a;
    private final /* synthetic */ int b;

    public adws(adwt adwtVar) {
        this.a = adwtVar;
    }

    public adws(adwt adwtVar, int i) {
        this.b = i;
        this.a = adwtVar;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return this.b != 0 ? new aypg[]{airwVar.G().a.Z(new ayqb(null) { // from class: adwo
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                adws adwsVar = adws.this;
                ahhw ahhwVar = (ahhw) obj;
                adwt adwtVar = adwsVar.a;
                adwi b = adwtVar.i.b();
                b.h(ahhwVar.c());
                adwtVar.m(b);
                adwsVar.a.b(6);
                aika aikaVar = aika.NEW;
                int ordinal = ahhwVar.c().ordinal();
                if (ordinal == 0) {
                    adwsVar.a.f(0);
                    adwsVar.a.g(null);
                    adwsVar.a.e("");
                } else if (ordinal != 2 && ordinal != 8) {
                } else {
                    adwsVar.a.f(1);
                    PlayerResponseModel b2 = ahhwVar.b();
                    if (b2 == null) {
                        return;
                    }
                    adwsVar.a.g(b2.A());
                    adwsVar.a.e(b2.B());
                }
            }
        })} : new aypg[]{airwVar.ao().Z(new ayqb() { // from class: adwr
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                WatchNextResponseModel watchNextResponseModel;
                audg audgVar;
                adws adwsVar = adws.this;
                ahhm ahhmVar = (ahhm) obj;
                adwt adwtVar = adwsVar.a;
                adwi b = adwtVar.i.b();
                b.f(ahhmVar.c());
                adwtVar.m(b);
                if (ahhmVar.c() == aijx.VIDEO_WATCH_LOADED) {
                    adwt adwtVar2 = adwsVar.a;
                    adwi b2 = adwtVar2.i.b();
                    b2.d = ahhmVar.a();
                    adwtVar2.m(b2);
                    adwt adwtVar3 = adwsVar.a;
                    if (!adwtVar3.i.l.isEmpty() && (watchNextResponseModel = adwtVar3.i.g) != null && (audgVar = watchNextResponseModel.g) != null) {
                        Iterator it = audgVar.i.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            audf audfVar = (audf) it.next();
                            if ((audfVar.b & 1) != 0) {
                                audk audkVar = audfVar.c;
                                if (audkVar == null) {
                                    audkVar = audk.a;
                                }
                                if (!audkVar.o.equals(adwtVar3.i.l)) {
                                    continue;
                                } else {
                                    audk audkVar2 = audfVar.c;
                                    if (audkVar2 == null) {
                                        audkVar2 = audk.a;
                                    }
                                    arag aragVar = audkVar2.c;
                                    if (aragVar == null) {
                                        aragVar = arag.a;
                                    }
                                    Spanned b3 = ajgl.b(aragVar);
                                    if (b3 instanceof SpannedString) {
                                        adwtVar3.g(b3.toString());
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                adwsVar.a.b(5);
            }
        })};
    }
}
