package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzacd implements Cloneable {
    private Object value;
    private zzacb<?, ?> zzbxo;
    private List<zzaci> zzbxp = new ArrayList();

    private final byte[] toByteArray() {
        byte[] bArr = new byte[zza()];
        zza(zzaby.zzj(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzvp */
    public final zzacd clone() {
        Object clone;
        zzacd zzacdVar = new zzacd();
        try {
            zzacdVar.zzbxo = this.zzbxo;
            if (this.zzbxp == null) {
                zzacdVar.zzbxp = null;
            } else {
                zzacdVar.zzbxp.addAll(this.zzbxp);
            }
            if (this.value != null) {
                if (this.value instanceof zzacg) {
                    clone = (zzacg) ((zzacg) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    clone = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length];
                        zzacdVar.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        clone = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        clone = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        clone = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        clone = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        clone = ((double[]) this.value).clone();
                    } else if (this.value instanceof zzacg[]) {
                        zzacg[] zzacgVarArr = (zzacg[]) this.value;
                        zzacg[] zzacgVarArr2 = new zzacg[zzacgVarArr.length];
                        zzacdVar.value = zzacgVarArr2;
                        while (i < zzacgVarArr.length) {
                            zzacgVarArr2[i] = (zzacg) zzacgVarArr[i].clone();
                            i++;
                        }
                    }
                }
                zzacdVar.value = clone;
                return zzacdVar;
            }
            return zzacdVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacd)) {
            return false;
        }
        zzacd zzacdVar = (zzacd) obj;
        if (this.value != null && zzacdVar.value != null) {
            if (this.zzbxo != zzacdVar.zzbxo) {
                return false;
            }
            return !this.zzbxo.zzbxh.isArray() ? this.value.equals(zzacdVar.value) : this.value instanceof byte[] ? Arrays.equals((byte[]) this.value, (byte[]) zzacdVar.value) : this.value instanceof int[] ? Arrays.equals((int[]) this.value, (int[]) zzacdVar.value) : this.value instanceof long[] ? Arrays.equals((long[]) this.value, (long[]) zzacdVar.value) : this.value instanceof float[] ? Arrays.equals((float[]) this.value, (float[]) zzacdVar.value) : this.value instanceof double[] ? Arrays.equals((double[]) this.value, (double[]) zzacdVar.value) : this.value instanceof boolean[] ? Arrays.equals((boolean[]) this.value, (boolean[]) zzacdVar.value) : Arrays.deepEquals((Object[]) this.value, (Object[]) zzacdVar.value);
        } else if (this.zzbxp != null && zzacdVar.zzbxp != null) {
            return this.zzbxp.equals(zzacdVar.zzbxp);
        } else {
            try {
                return Arrays.equals(toByteArray(), zzacdVar.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza() {
        int i;
        if (this.value != null) {
            zzacb<?, ?> zzacbVar = this.zzbxo;
            Object obj = this.value;
            if (!zzacbVar.zzbxi) {
                return zzacbVar.zzv(obj);
            }
            int length = Array.getLength(obj);
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Array.get(obj, i2) != null) {
                    i += zzacbVar.zzv(Array.get(obj, i2));
                }
            }
        } else {
            i = 0;
            for (zzaci zzaciVar : this.zzbxp) {
                i += zzaby.zzas(zzaciVar.tag) + 0 + zzaciVar.zzbrm.length;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzaby zzabyVar) {
        if (this.value == null) {
            for (zzaci zzaciVar : this.zzbxp) {
                zzabyVar.zzar(zzaciVar.tag);
                zzabyVar.zzk(zzaciVar.zzbrm);
            }
            return;
        }
        zzacb<?, ?> zzacbVar = this.zzbxo;
        Object obj = this.value;
        if (!zzacbVar.zzbxi) {
            zzacbVar.zza(obj, zzabyVar);
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                zzacbVar.zza(obj2, zzabyVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzaci zzaciVar) {
        Object zzi;
        if (this.zzbxp != null) {
            this.zzbxp.add(zzaciVar);
            return;
        }
        if (this.value instanceof zzacg) {
            byte[] bArr = zzaciVar.zzbrm;
            zzabx zza = zzabx.zza(bArr, 0, bArr.length);
            int zzvh = zza.zzvh();
            if (zzvh != bArr.length - zzaby.zzao(zzvh)) {
                throw zzacf.zzvq();
            }
            zzi = ((zzacg) this.value).zzb(zza);
        } else if (this.value instanceof zzacg[]) {
            zzacg[] zzacgVarArr = (zzacg[]) this.zzbxo.zzi(Collections.singletonList(zzaciVar));
            zzacg[] zzacgVarArr2 = (zzacg[]) this.value;
            zzacg[] zzacgVarArr3 = (zzacg[]) Arrays.copyOf(zzacgVarArr2, zzacgVarArr2.length + zzacgVarArr.length);
            System.arraycopy(zzacgVarArr, 0, zzacgVarArr3, zzacgVarArr2.length, zzacgVarArr.length);
            zzi = zzacgVarArr3;
        } else {
            zzi = this.zzbxo.zzi(Collections.singletonList(zzaciVar));
        }
        this.zzbxo = this.zzbxo;
        this.value = zzi;
        this.zzbxp = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T zzb(zzacb<?, T> zzacbVar) {
        if (this.value == null) {
            this.zzbxo = zzacbVar;
            this.value = zzacbVar.zzi(this.zzbxp);
            this.zzbxp = null;
        } else if (!this.zzbxo.equals(zzacbVar)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return (T) this.value;
    }
}
