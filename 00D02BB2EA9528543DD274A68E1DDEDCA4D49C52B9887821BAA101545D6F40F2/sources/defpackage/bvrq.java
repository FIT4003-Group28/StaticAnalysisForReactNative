package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bvrq  reason: default package */
/* loaded from: classes4.dex */
public final class bvrq {
    public static Intent a(dplx dplxVar) {
        Intent intent = new Intent();
        if ((dplxVar.a & 1) != 0) {
            intent.setAction(dplxVar.b);
        }
        if ((dplxVar.a & 2) != 0) {
            intent.setData(Uri.parse(dplxVar.c));
        }
        if ((dplxVar.a & 4) != 0) {
            intent.setComponent(ComponentName.unflattenFromString(dplxVar.d));
        }
        if ((dplxVar.a & 8) != 0) {
            intent.setFlags(dplxVar.e);
        }
        if (dplxVar.f.size() > 0) {
            for (dplw dplwVar : dplxVar.f) {
                int i = dplwVar.b;
                if (i == 2) {
                    intent.putExtra(dplwVar.d, (String) dplwVar.c);
                } else if (i == 3) {
                    intent.putExtra(dplwVar.d, ((dspd) dplwVar.c).G());
                } else if (i == 4) {
                    intent.putExtra(dplwVar.d, ((Integer) dplwVar.c).intValue());
                } else if (i == 5) {
                    intent.putExtra(dplwVar.d, ((Boolean) dplwVar.c).booleanValue());
                }
            }
        }
        return intent;
    }

    public static dplx b(Intent intent) {
        dplu bZ = dplx.g.bZ();
        String action = intent.getAction();
        if (action != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dplx dplxVar = (dplx) bZ.b;
            action.getClass();
            dplxVar.a |= 1;
            dplxVar.b = action;
        }
        Uri data = intent.getData();
        if (data != null) {
            String uri = data.toString();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dplx dplxVar2 = (dplx) bZ.b;
            uri.getClass();
            dplxVar2.a |= 2;
            dplxVar2.c = uri;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            String flattenToString = component.flattenToString();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dplx dplxVar3 = (dplx) bZ.b;
            flattenToString.getClass();
            dplxVar3.a |= 4;
            dplxVar3.d = flattenToString;
        }
        if (intent.getFlags() != 0) {
            int flags = intent.getFlags();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dplx dplxVar4 = (dplx) bZ.b;
            dplxVar4.a |= 8;
            dplxVar4.e = flags;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                if (obj instanceof String) {
                    dplv bZ2 = dplw.e.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dplw dplwVar = (dplw) bZ2.b;
                    str.getClass();
                    dplwVar.a |= 1;
                    dplwVar.d = str;
                    String obj2 = obj.toString();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dplw dplwVar2 = (dplw) bZ2.b;
                    obj2.getClass();
                    dplwVar2.b = 2;
                    dplwVar2.c = obj2;
                    bZ.b(bZ2.bK());
                } else if (obj instanceof byte[]) {
                    dplv bZ3 = dplw.e.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dplw dplwVar3 = (dplw) bZ3.b;
                    str.getClass();
                    dplwVar3.a |= 1;
                    dplwVar3.d = str;
                    dspd x = dspd.x((byte[]) obj);
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dplw dplwVar4 = (dplw) bZ3.b;
                    x.getClass();
                    dplwVar4.b = 3;
                    dplwVar4.c = x;
                    bZ.b(bZ3.bK());
                } else if (obj instanceof Integer) {
                    dplv bZ4 = dplw.e.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dplw dplwVar5 = (dplw) bZ4.b;
                    str.getClass();
                    dplwVar5.a |= 1;
                    dplwVar5.d = str;
                    int intValue = ((Integer) obj).intValue();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dplw dplwVar6 = (dplw) bZ4.b;
                    dplwVar6.b = 4;
                    dplwVar6.c = Integer.valueOf(intValue);
                    bZ.b(bZ4.bK());
                } else if (obj instanceof Boolean) {
                    dplv bZ5 = dplw.e.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dplw dplwVar7 = (dplw) bZ5.b;
                    str.getClass();
                    dplwVar7.a |= 1;
                    dplwVar7.d = str;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dplw dplwVar8 = (dplw) bZ5.b;
                    dplwVar8.b = 5;
                    dplwVar8.c = Boolean.valueOf(booleanValue);
                    bZ.b(bZ5.bK());
                }
            }
        }
        return bZ.bK();
    }
}
