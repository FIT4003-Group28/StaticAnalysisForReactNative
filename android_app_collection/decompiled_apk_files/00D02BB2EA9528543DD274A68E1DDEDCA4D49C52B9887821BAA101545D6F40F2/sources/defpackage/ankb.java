package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ankb  reason: default package */
/* loaded from: classes2.dex */
public final class ankb implements ango {
    public final Context a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public ankb(Application application) {
        this.a = application;
    }

    private final void a(int i) {
        b(this.a.getString(i));
    }

    private final void b(final String str) {
        this.b.post(new Runnable(this, str) { // from class: anka
            private final ankb a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ankb ankbVar = this.a;
                Toast.makeText(ankbVar.a, this.b, 0).show();
            }
        });
    }

    private static boolean g(dnrw dnrwVar) {
        int i = dnrwVar.a;
        return i == 2 || i == 3;
    }

    private static dvax h(dnrw dnrwVar) {
        int i = dnrwVar.a;
        if (i == 2) {
            dnsc dnscVar = ((dnqx) dnrwVar.b).b;
            if (dnscVar == null) {
                dnscVar = dnsc.f;
            }
            return i(dnscVar);
        } else if (i == 4) {
            dnsc dnscVar2 = ((dnqz) dnrwVar.b).b;
            if (dnscVar2 == null) {
                dnscVar2 = dnsc.f;
            }
            return i(dnscVar2);
        } else if (i == 3) {
            dnsc dnscVar3 = ((dnrj) dnrwVar.b).c;
            if (dnscVar3 == null) {
                dnscVar3 = dnsc.f;
            }
            return i(dnscVar3);
        } else if (i == 1) {
            dnsc dnscVar4 = ((dnrp) dnrwVar.b).b;
            if (dnscVar4 == null) {
                dnscVar4 = dnsc.f;
            }
            return i(dnscVar4);
        } else {
            return dvax.UNKNOWN;
        }
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        if (duycVar.b.size() > 0) {
            dnrw dnrwVar = duycVar.b.get(0);
            if (g(dnrwVar)) {
                dvax dvaxVar = dvax.UNKNOWN;
                int ordinal = h(dnrwVar).ordinal();
                if (ordinal == 2) {
                    a(R.string.MAPS_ACTIVITY_PLACE_EDIT_SAVED);
                    return;
                } else if (ordinal != 3) {
                    return;
                } else {
                    a(R.string.MAPS_ACTIVITY_SUCCESS_ACTIVITY_UPDATED);
                    return;
                }
            }
            int i = dnrwVar.a;
            if (i == 1) {
                a(R.string.MAPS_ACTIVITY_PLACE_REMOVED);
            } else if (i == 5) {
                b(this.a.getResources().getQuantityString(R.plurals.MAPS_ACTIVITY_PHOTOS_REMOVED, ((dnrn) dnrwVar.b).a.size()));
            } else if (i == 6) {
                a(anfx.MAPS_ACTIVITY_DATA_DONATED);
            } else if (i == 4) {
                a(R.string.MAPS_ACTIVITY_PLACE_ADDED);
            } else if (i != 8) {
                if (i != 12) {
                    return;
                }
                a(R.string.MAPS_ACTIVITY_CHILD_VISITS_SAVED);
            } else {
                dork dorkVar = ((dnrf) dnrwVar.b).c;
                if (dorkVar == null) {
                    dorkVar = dork.e;
                }
                int i2 = dorkVar.a;
                int i3 = i2 & 1;
                if (i3 != 0 && (i2 & 2) != 0) {
                    a(R.string.TIMELINE_TITLE_AND_NOTE_SAVED);
                } else if (i3 != 0) {
                    a(R.string.TIMELINE_TITLE_SAVED);
                } else if ((i2 & 2) == 0) {
                } else {
                    a(R.string.TIMELINE_NOTE_SAVED);
                }
            }
        }
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        if (duycVar.b.size() > 0) {
            dnrw dnrwVar = duycVar.b.get(0);
            if (g(dnrwVar)) {
                dvax dvaxVar = dvax.UNKNOWN;
                int ordinal = h(dnrwVar).ordinal();
                if (ordinal == 2) {
                    a(R.string.MAPS_ACTIVITY_ERROR_COULDNT_UPDATE_PLACE);
                    return;
                } else if (ordinal != 3) {
                    return;
                } else {
                    a(R.string.MAPS_ACTIVITY_ERROR_COULDNT_UPDATE_ACTIVITY);
                    return;
                }
            }
            int i = dnrwVar.a;
            if (i == 1) {
                a(R.string.MAPS_ACTIVITY_ERROR_COULDNT_REMOVE_STOP);
            } else if (i == 5) {
                a(R.string.MAPS_ACTIVITY_ERROR_COULDNT_REMOVE_PHOTO);
            } else if (i == 4) {
                a(R.string.MAPS_ACTIVITY_ERROR_COULDNT_ADD_PLACE);
            } else if (i != 8) {
                if (i != 12) {
                    return;
                }
                a(R.string.MAPS_ACTIVITY_CHILD_VISITS_NOT_SAVED);
            } else {
                dork dorkVar = ((dnrf) dnrwVar.b).c;
                if (dorkVar == null) {
                    dorkVar = dork.e;
                }
                int i2 = dorkVar.a;
                int i3 = i2 & 1;
                if (i3 != 0 && (i2 & 2) != 0) {
                    a(R.string.TIMELINE_TITLE_AND_NOTE_NOT_SAVED);
                } else if (i3 != 0) {
                    a(R.string.TIMELINE_TITLE_NOT_SAVED);
                } else if ((i2 & 2) == 0) {
                } else {
                    a(R.string.TIMELINE_NOTE_NOT_SAVED);
                }
            }
        }
    }

    private static dvax i(dnsc dnscVar) {
        int i = dnscVar.b;
        if (i != 1) {
            if (i != 6) {
                return dvax.UNKNOWN;
            }
            return dvax.ACTIVITY;
        }
        return dvax.STOP;
    }
}
