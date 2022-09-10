package defpackage;

import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: dlq  reason: default package */
/* loaded from: classes6.dex */
public final class dlq {
    public final dfkr a;
    public final dbsg<dfkr> b;
    private final CronetEngine c;

    public dlq(btvo btvoVar, dlm dlmVar, CronetEngine cronetEngine) {
        this.c = cronetEngine;
        final String str = btvoVar.getNavigationParameters().J().f;
        this.a = dlmVar.a(new dlk(this, str) { // from class: dlo
            private final dlq a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.dlk
            public final dyhj a() {
                return this.a.a(this.b);
            }
        });
        final String str2 = btvoVar.getNavigationParameters().J().g;
        if (dbsj.d(str2)) {
            this.b = dbpy.a;
        } else {
            this.b = dbsg.i(dlmVar.a(new dlk(this, str2) { // from class: dlp
                private final dlq a;
                private final String b;

                {
                    this.a = this;
                    this.b = str2;
                }

                @Override // defpackage.dlk
                public final dyhj a() {
                    return this.a.a(this.b);
                }
            }));
        }
    }

    public final dyhj<?> a(String str) {
        if (this.c.getVersionString().contains("CronetHttpURLConnection")) {
            return dywh.a(str, 443);
        }
        return dyjw.a(str, 443, this.c);
    }
}
