package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ttj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ttj implements anir {
    public final /* synthetic */ tuk a;
    public final /* synthetic */ tqk b;
    public final /* synthetic */ tqm c;
    private final /* synthetic */ int d;

    public /* synthetic */ ttj(tuk tukVar, tqk tqkVar, tqm tqmVar) {
        this.a = tukVar;
        this.b = tqkVar;
        this.c = tqmVar;
    }

    public /* synthetic */ ttj(tuk tukVar, tqk tqkVar, tqm tqmVar, int i) {
        this.d = i;
        this.a = tukVar;
        this.b = tqkVar;
        this.c = tqmVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.d;
        if (i == 0) {
            tuk tukVar = this.a;
            tqk tqkVar = this.b;
            tqm tqmVar = this.c;
            Uri uri = (Uri) obj;
            if (uri != null) {
                tukVar.a(uri, tqkVar, tqmVar);
            }
            return ankq.a;
        } else if (i == 1) {
            tuk tukVar2 = this.a;
            Uri uri2 = (Uri) obj;
            Uri d = tzc.d(tukVar2.a, tukVar2.i, this.b, this.c);
            try {
                Uri parse = Uri.parse(d.toString().substring(0, d.toString().lastIndexOf("/")));
                if (!tukVar2.g.h(parse)) {
                    tukVar2.g.d(parse);
                }
                Context context = tukVar2.a;
                uri2.getClass();
                tzi.b(context, d, uri2);
                return ankq.a;
            } catch (IOException e) {
                tpy a = tqa.a();
                a.a = tpz.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                a.b = "Unable to create symlink";
                a.c = e;
                return anlz.p(a.a());
            }
        } else {
            tuk tukVar3 = this.a;
            tqk tqkVar2 = this.b;
            tqm tqmVar2 = this.c;
            if (!((Boolean) obj).booleanValue()) {
                typ.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", tqkVar2.c, tqmVar2.d);
                tuk.v(tukVar3.b, tqmVar2, tqkVar2, 14);
            }
            return ankq.a;
        }
    }
}
