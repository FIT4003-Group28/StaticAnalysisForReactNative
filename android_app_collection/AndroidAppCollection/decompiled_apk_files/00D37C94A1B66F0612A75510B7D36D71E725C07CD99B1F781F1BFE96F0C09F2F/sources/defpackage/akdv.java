package defpackage;

import android.os.Build;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: akdv  reason: default package */
/* loaded from: classes.dex */
public final class akdv {
    private final akdu a;
    private final acti b;
    private final ArrayList c;
    private final int d;
    private final int e;
    private final Runnable f;
    private final Runnable g;
    private final akdr h;

    public akdv(akdu akduVar, acti actiVar, List list, int i, int i2, Runnable runnable, Runnable runnable2, akdr akdrVar) {
        this.a = akduVar;
        actiVar.getClass();
        this.b = actiVar;
        this.c = new ArrayList(list);
        this.d = i;
        this.e = i2;
        this.f = runnable;
        this.g = runnable2;
        this.h = akdrVar;
    }

    private final void c() {
        while (!this.c.isEmpty() && akdr.h(this.a.a(), ((PermissionDescriptor) this.c.get(0)).a)) {
            this.c.remove(0);
        }
        if (this.c.isEmpty()) {
            this.f.run();
            return;
        }
        PermissionDescriptor permissionDescriptor = (PermissionDescriptor) this.c.get(0);
        acup acupVar = permissionDescriptor.b;
        if (acupVar != null) {
            this.b.D(new acte(acupVar));
        }
        acup acupVar2 = permissionDescriptor.c;
        if (acupVar2 != null) {
            this.b.D(new acte(acupVar2));
        }
        String[] l = akdr.l(permissionDescriptor.a);
        this.h.d(l);
        this.a.c(l, permissionDescriptor.a);
    }

    public final void a() {
        int i = 0;
        if (Build.VERSION.SDK_INT < 23) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            while (i < size) {
                i++;
                if (!akdr.h(this.a.a(), ((PermissionDescriptor) arrayList.get(i)).a)) {
                    this.g.run();
                    return;
                }
            }
            this.f.run();
            return;
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        while (i < size2) {
            i++;
            if (this.h.i(this.a.a(), ((PermissionDescriptor) arrayList2.get(i)).a)) {
                akdm.aE(this.d).qv(this.a.b(), "openSettingsDialog");
                this.g.run();
                return;
            }
        }
        c();
    }

    public final boolean b(int i, String[] strArr, int[] iArr) {
        boolean z = false;
        if (this.c.isEmpty()) {
            return false;
        }
        if (strArr.length == 0) {
            this.g.run();
            return true;
        }
        PermissionDescriptor permissionDescriptor = (PermissionDescriptor) this.c.remove(0);
        int i2 = permissionDescriptor.a;
        if (i2 == i) {
            z = true;
        }
        aqxo.C(z, "Expected %s, got %s", i2, i);
        if (!akdr.e(iArr)) {
            acup acupVar = permissionDescriptor.c;
            if (acupVar != null) {
                this.b.H(3, new acte(acupVar), null);
            }
            if (this.e != 0) {
                zag.q(this.a.a(), this.e, 1);
            }
            this.g.run();
            return true;
        }
        acup acupVar2 = permissionDescriptor.b;
        if (acupVar2 != null) {
            this.b.H(3, new acte(acupVar2), null);
        }
        c();
        return true;
    }
}
