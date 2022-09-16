package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abav  reason: default package */
/* loaded from: classes.dex */
public final class abav extends aaqs {
    public final List a;

    public abav(aaqf aaqfVar, afvm afvmVar) {
        super("playlist/get_add_to_playlist", aaqfVar, afvmVar);
        this.a = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asbb.a.createBuilder();
        if (this.a.isEmpty() || !TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(null) && this.a.isEmpty()) {
                createBuilder.copyOnWrite();
                asbb asbbVar = (asbb) createBuilder.instance;
                throw null;
            }
        } else {
            List list = this.a;
            createBuilder.copyOnWrite();
            asbb asbbVar2 = (asbb) createBuilder.instance;
            aopu aopuVar = asbbVar2.d;
            if (!aopuVar.c()) {
                asbbVar2.d = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) asbbVar2.d);
        }
        createBuilder.copyOnWrite();
        asbb asbbVar3 = (asbb) createBuilder.instance;
        asbbVar3.b |= 4;
        asbbVar3.e = false;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.z(this.a.isEmpty() ^ TextUtils.isEmpty(null), "GetAddToPlaylistServiceRequest must have videoIds XOR playlistId");
    }
}
