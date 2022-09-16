package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Set;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aind  reason: default package */
/* loaded from: classes.dex */
public final class aind implements ayqe {
    private final aapv a;
    private final afvn b;
    private final aanz c;
    private final Set d;
    private final String e;
    private final long f;

    public aind(aapv aapvVar, afvn afvnVar, aanz aanzVar, Set set, String str, long j) {
        this.a = aapvVar;
        this.b = afvnVar;
        this.c = aanzVar;
        this.d = set;
        this.e = str;
        this.f = j;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        asaj asajVar;
        asdd asddVar = (asdd) obj;
        int i = asddVar.b;
        if (i != 4) {
            if (i == 2) {
                asajVar = (asaj) asddVar.c;
            } else {
                asajVar = asaj.a;
            }
            if ((asajVar.c & 64) != 0) {
                aapv aapvVar = this.a;
                afvm c = this.b.c();
                arbf arbfVar = asajVar.K;
                if (arbfVar == null) {
                    arbfVar = arbf.a;
                }
                arpa arpaVar = asajVar.d;
                if (arpaVar == null) {
                    arpaVar = arpa.a;
                }
                aapvVar.a(c, arbfVar, arpaVar);
            }
            long j = this.f;
            PlayerResponseModel playerResponseModel = new PlayerResponseModel(asajVar, j, PlayerResponseModel.e(this.c, asajVar, j, this.e));
            for (aaoo aaooVar : this.d) {
                if (aaooVar != null) {
                    aaooVar.a(playerResponseModel);
                }
            }
            return playerResponseModel;
        }
        throw new ExecutionException((String) asddVar.c, null);
    }
}
