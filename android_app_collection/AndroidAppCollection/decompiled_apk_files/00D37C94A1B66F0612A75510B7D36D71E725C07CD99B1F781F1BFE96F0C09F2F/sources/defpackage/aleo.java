package defpackage;

import android.database.sqlite.SQLiteException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aleo  reason: default package */
/* loaded from: classes.dex */
public abstract class aleo extends algt {
    private final aadd a;
    private final akze b;
    protected final alht d;

    public aleo(aadd aaddVar, avuo avuoVar, albf albfVar, akze akzeVar, alht alhtVar) {
        super(avuoVar, albfVar, alhtVar);
        this.a = aaddVar;
        this.b = akzeVar;
        this.d = alhtVar;
    }

    private final akzh s(Throwable th, int i) {
        avun avunVar;
        if (th instanceof akzh) {
            return (akzh) th;
        }
        if (th instanceof akzq) {
            return akzh.b(avun.UPLOAD_PROCESSOR_FAILURE_REASON_DATABASE_EXCEPTION, th);
        }
        if (th instanceof SecurityException) {
            return akzh.b(avun.UPLOAD_PROCESSOR_FAILURE_REASON_FILE_PERMISSION, th);
        }
        if ((th instanceof IOException) || (th instanceof IndexOutOfBoundsException)) {
            if (th instanceof vqc) {
                vqb vqbVar = ((vqc) th).a;
                vqb vqbVar2 = vqb.ISO_FILE;
                switch (vqbVar.ordinal()) {
                    case 0:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_ISO_FILE;
                        break;
                    case 1:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERATING_OUTPUT_TRACKS;
                        break;
                    case 2:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_CREATING_MP4_TRACK;
                        break;
                    case 3:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERATING_AUDIO_SWAP_TRACKS;
                        break;
                    case 4:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_VIDEO_KEY_FRAME_RANGE;
                        break;
                    case 5:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_CREATING_CROPPED_TRACK;
                        break;
                    case 6:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERIC_BUILD_AUDIO_SWAP_FILE;
                        break;
                    case 7:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERIC_BUILD_TRIMMED_ISO_FILE;
                        break;
                    case 8:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_GENERIC_MOVIE_INPUT_STREAM;
                        break;
                    case 9:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_MOVIE_INPUT_STREAM_CRC_MISMATCH;
                        break;
                    case 10:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_MOVIE_INPUT_STREAM_READ;
                        break;
                    case 11:
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_AUDIO_MIX_RENDERER_SETUP;
                        break;
                    default:
                        this.b.a("EditedVideoException missing reason.");
                        avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_MP4_EDITS_UNKNOWN_REASON;
                        break;
                }
                return akzh.b(avunVar, th);
            } else if (th instanceof EOFException) {
                return akzh.b(avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNEXPECTED_END_OF_FILE, th);
            } else {
                if (th instanceof FileNotFoundException) {
                    return akzh.b(avun.UPLOAD_PROCESSOR_FAILURE_REASON_FILE_NOT_FOUND, th);
                }
                akzh v = v(th, i);
                return v != null ? v : akzh.b(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SOURCE_FAILED, th);
            }
        } else if (th instanceof SQLiteException) {
            return akzh.b(avun.UPLOAD_PROCESSOR_FAILURE_REASON_SQL_LITE_EXCEPTION, th);
        } else {
            if (th instanceof OutOfMemoryError) {
                return akzh.b(avun.UPLOAD_PROCESSOR_FAILURE_REASON_OUT_OF_MEMORY, th);
            }
            akzh v2 = v(th, i);
            return v2 != null ? v2 : akzh.b(avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNHANDLED_EXCEPTION, th);
        }
    }

    private final akzh v(Throwable th, int i) {
        Throwable cause = th.getCause();
        if (cause == null || i <= 0) {
            return null;
        }
        return s(cause, i - 1);
    }

    public abstract ankt c(String str, akzp akzpVar, alcw alcwVar);

    public boolean g() {
        return false;
    }

    public abstract boolean i(alcw alcwVar);

    public akzs k(Throwable th, alcw alcwVar, boolean z) {
        int i = 0;
        if (this.a.a() != null && (this.a.a().b & 4096) != 0) {
            avvf avvfVar = this.a.a().h;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            i = avvfVar.C;
        }
        akzh s = s(th, i);
        if (s.a != avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) {
            akze akzeVar = this.b;
            String f = f();
            String message = s.getMessage();
            StringBuilder sb = new StringBuilder(f.length() + 1 + String.valueOf(message).length());
            sb.append(f);
            sb.append(" ");
            sb.append(message);
            String sb2 = sb.toString();
            alcu a = alcu.a(alcwVar.l);
            if (a == null) {
                a = alcu.UNKNOWN_UPLOAD;
            }
            akzeVar.c(sb2, s, a);
        }
        return t(n(alcwVar, s), z);
    }

    @Override // defpackage.algt
    public final akzs m(Throwable th, String str, akzp akzpVar, boolean z) {
        try {
            alcw b = akzpVar.b(str);
            if (b == null) {
                return t(this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND), z);
            }
            return k(th, b, z);
        } catch (akzq unused) {
            return t(this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_DATABASE_EXCEPTION), z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final alct n(alcw alcwVar, akzh akzhVar) {
        if (akzhVar.b) {
            alht alhtVar = this.d;
            avun avunVar = akzhVar.a;
            alct b = b(alcwVar);
            b.getClass();
            return alhtVar.d(avunVar, b, akzhVar.c, this.b);
        }
        return this.d.c(akzhVar.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alcw o(String str, akzp akzpVar, boolean z) {
        alcw b = akzpVar.b(str);
        if (b != null) {
            if (!z || g() || !b.ad) {
                if (!i(b)) {
                    throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_JOB_STATE);
                }
                return b;
            }
            throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED);
        }
        throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND);
    }

    @Override // defpackage.algt
    public final ankt p(final String str, final akzp akzpVar) {
        return anlz.v(new aniq() { // from class: alen
            @Override // defpackage.aniq
            public final ankt a() {
                aleo aleoVar = aleo.this;
                String str2 = str;
                akzp akzpVar2 = akzpVar;
                alcw o = aleoVar.o(str2, akzpVar2, true);
                aleoVar.q(o);
                return aleoVar.c(str2, akzpVar2, o);
            }
        }, anjk.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(alcw alcwVar) {
    }
}
