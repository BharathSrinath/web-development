import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  // This line adds the fastRefresh option
  optimizeDeps: {
    include: ['react', 'react-dom'],
  },
});
