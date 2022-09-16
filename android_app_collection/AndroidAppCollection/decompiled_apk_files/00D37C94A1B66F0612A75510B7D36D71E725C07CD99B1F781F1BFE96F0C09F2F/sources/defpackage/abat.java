package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abat  reason: default package */
/* loaded from: classes.dex */
public final class abat extends aaqs {
    public String a;
    public String b;
    public int c;
    private String d;
    private final List s;

    /* JADX INFO: Access modifiers changed from: protected */
    public abat(aaqf aaqfVar, afvm afvmVar) {
        super("playlist/create", aaqfVar, afvmVar);
        this.c = 1;
        this.s = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asax.a.createBuilder();
        String str = this.d;
        createBuilder.copyOnWrite();
        asax asaxVar = (asax) createBuilder.instance;
        str.getClass();
        asaxVar.b |= 4;
        asaxVar.d = str;
        if (TextUtils.isEmpty(null)) {
            if (this.s.isEmpty() || !TextUtils.isEmpty(this.a)) {
                if (this.s.isEmpty() && !TextUtils.isEmpty(this.a)) {
                    String str2 = this.a;
                    createBuilder.copyOnWrite();
                    asax asaxVar2 = (asax) createBuilder.instance;
                    str2.getClass();
                    asaxVar2.b |= 8;
                    asaxVar2.f = str2;
                }
            } else {
                List list = this.s;
                createBuilder.copyOnWrite();
                asax asaxVar3 = (asax) createBuilder.instance;
                aopu aopuVar = asaxVar3.e;
                if (!aopuVar.c()) {
                    asaxVar3.e = aopi.mutableCopy(aopuVar);
                }
                aonk.addAll((Iterable) list, (List) asaxVar3.e);
            }
            int i = this.c;
            createBuilder.copyOnWrite();
            asax asaxVar4 = (asax) createBuilder.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            asaxVar4.g = i2;
            asaxVar4.b |= 16;
            String str3 = this.b;
            if (str3 != null) {
                createBuilder.copyOnWrite();
                asax asaxVar5 = (asax) createBuilder.instance;
                asaxVar5.b |= 64;
                asaxVar5.h = str3;
            }
            return createBuilder;
        }
        createBuilder.copyOnWrite();
        asax asaxVar6 = (asax) createBuilder.instance;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        if (!this.s.isEmpty() && !TextUtils.isEmpty(this.a)) {
            z = false;
        }
        aqxo.z(z, "CreatePlaylistServiceRequest can only have videoIds or sourcePlaylistId");
    }

    public final void t(String str) {
        this.s.add(str);
    }

    public final void u(String str) {
        this.d = g(str);
    }
}
