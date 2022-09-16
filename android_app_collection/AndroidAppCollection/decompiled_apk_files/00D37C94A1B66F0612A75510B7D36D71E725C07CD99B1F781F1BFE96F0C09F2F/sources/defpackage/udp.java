package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: udp  reason: default package */
/* loaded from: classes4.dex */
public final class udp implements udj {
    private final uiy a;
    private final ues b;
    private final /* synthetic */ int c;

    public udp(ues uesVar, uiy uiyVar, int i) {
        this.c = i;
        this.b = uesVar;
        this.a = uiyVar;
    }

    public udp(uiy uiyVar, ues uesVar) {
        this.a = uiyVar;
        this.b = uesVar;
    }

    public udp(uiy uiyVar, ues uesVar, int i) {
        this.c = i;
        this.a = uiyVar;
        this.b = uesVar;
    }

    @Override // defpackage.udj
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.udj
    public final boolean c(Intent intent) {
        char c;
        int i = this.c;
        if (i == 0) {
            return "android.intent.action.LOCALE_CHANGED".equals(intent.getAction());
        } else if (i != 1) {
            return "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction());
        } else {
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode == 452039370) {
                if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 806551504) {
                if (hashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                    c = 2;
                }
                c = 65535;
            }
            return c == 0 || c == 1 || c == 2;
        }
    }

    @Override // defpackage.udj
    public final void b(Intent intent, ubz ubzVar, long j) {
        String str;
        String str2;
        char c;
        int i = this.c;
        if (i == 0) {
            uev.e("LocaleChangedIntentHandler", "Syncing registration statuses due to Locale change.", new Object[0]);
            if (axqb.a.get().d()) {
                this.b.b(aojs.LOCALE_CHANGED).i();
            }
            this.a.a(aomi.LOCALE_CHANGED);
        } else if (i == 1) {
            uev.e("BlockStateChangedIntentHandler", "BlockStateChanged due to Intent Action: [%s]", intent.getAction());
            Bundle extras = intent.getExtras();
            uep uepVar = null;
            uhd uhdVar = null;
            if (Build.VERSION.SDK_INT < 28 || extras == null) {
                str = null;
                str2 = null;
            } else {
                str2 = extras.getString("android.app.extra.NOTIFICATION_CHANNEL_ID");
                str = extras.getString("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
            }
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode == 452039370) {
                if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 806551504) {
                if (hashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                    c = 2;
                }
                c = 65535;
            }
            if (c == 0) {
                uepVar = this.b.a(aojw.APP_BLOCK_STATE_CHANGED);
            } else if (c == 1) {
                uepVar = this.b.a(aojw.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED);
                if (str2 != null) {
                    uepVar.a(str2);
                }
            } else if (c == 2) {
                uep a = this.b.a(aojw.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED);
                if (str != null) {
                    ueu ueuVar = (ueu) a;
                    Iterator it = ueuVar.g.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        uhd uhdVar2 = (uhd) it.next();
                        if (uhdVar2.a.equals(str)) {
                            uhdVar = uhdVar2;
                            break;
                        }
                    }
                    ueuVar.p = uhdVar;
                }
                uepVar = a;
            }
            if (uepVar != null) {
                uepVar.i();
            } else {
                uev.b("BlockStateChangedIntentHandler", "ChimeLogEvent uninitialized, perhaps due to unvalidated event.", new Object[0]);
            }
            this.a.a(aomi.CHANNEL_BLOCK_STATE_CHANGED);
        } else {
            uev.e("TimezoneChangedIntentHandler", "Syncing registration statuses due to timezone change.", new Object[0]);
            if (axqb.a.get().f()) {
                this.b.b(aojs.TIMEZONE_CHANGED).i();
            }
            this.a.a(aomi.TIMEZONE_CHANGED);
        }
    }
}
