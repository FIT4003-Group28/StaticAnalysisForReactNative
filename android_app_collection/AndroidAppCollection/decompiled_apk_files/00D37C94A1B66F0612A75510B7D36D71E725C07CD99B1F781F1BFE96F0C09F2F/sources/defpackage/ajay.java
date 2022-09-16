package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ajay  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajay implements ayqb {
    public final /* synthetic */ ajba a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajay(ajba ajbaVar) {
        this.a = ajbaVar;
    }

    public /* synthetic */ ajay(ajba ajbaVar, int i) {
        this.b = i;
        this.a = ajbaVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.S((ahgh) obj);
            return;
        }
        boolean z = false;
        if (i == 1) {
            ajba ajbaVar = this.a;
            if (((ahic) obj).a().a() != 0) {
                z = true;
            }
            ajbaVar.d = z;
        } else if (i == 2) {
            ahgl ahglVar = (ahgl) obj;
            this.a.z();
        } else if (i != 3) {
            if (i == 4) {
                this.a.e((ahhx) obj);
            } else {
                this.a.v((ahia) obj);
            }
        } else {
            ajba ajbaVar2 = this.a;
            ahhj ahhjVar = (ahhj) obj;
            aijw aijwVar = aijw.PLAYBACK_PENDING;
            aika aikaVar = aika.NEW;
            int ordinal = ahhjVar.b().ordinal();
            if (ordinal != 1) {
                if (ordinal != 7) {
                    return;
                }
                ajbaVar2.z();
                return;
            }
            PlayerResponseModel a = ahhjVar.a();
            if (a != null && a.F()) {
                z = true;
            }
            ajbaVar2.e = z;
            if (z && ajbaVar2.c > 1.0f) {
                ajbaVar2.y();
            }
            ((ajaz) ajbaVar2.a.get()).F(ajbaVar2.c);
        }
    }
}
